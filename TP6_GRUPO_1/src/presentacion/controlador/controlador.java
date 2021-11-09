package presentacion.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import entidades.Persona;
import negocio.PersonaNegocio;
import presentacion.vista.ventana;
import presentacion.vista.agregar;
import presentacion.vista.eliminar;
import presentacion.vista.listar;
import presentacion.vista.modificar;

public class controlador implements ActionListener, KeyListener{
	
	private ventana principal;
	private agregar JAgregar;
	private eliminar JEliminar;
	private listar JListar;
	private modificar JModificar;
	private PersonaNegocio negocio;
	private ArrayList<Persona> personasEnLista;
	
	private final String MSG_CAMPOS_VACIOS = "Es necesario completar todos los campos";
	private final String MSG_DNI_INVALIDO = "El DNI ingresado ya existe";
	private final String MSG_OPERACION_EXITO = "Se guardaron los datos correctamente";
	private final String MSG_OPERACION_ERROR = "Hubo un error al guardar los datos";
	private final String MSG_ELIMINAR_EXITO = "Se elimino a la persona correctamente";
	
	public controlador(ventana princi, PersonaNegocio negocio) {
		
		this.principal = princi;
		this.negocio = negocio;
		
		
		this.JAgregar = new agregar();
		this.JEliminar = new eliminar();
		this.JListar = new listar();
		this.JModificar = new modificar();
		
		this.principal.getmntmAgregar().addActionListener(a->agregar(a));
		this.principal.getMntmModificar().addActionListener(a->modificar(a));
		this.principal.getMntmListar().addActionListener(a->listar(a));
		this.principal.getMntmEliminar().addActionListener(a->eliminar(a));
		
		//Eventos
		this.JAgregar.getBtnAceptar().addActionListener(a -> EventoAceptar_MenuAgregar(a));
		this.JAgregar.getTxtDNI().addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char caracter = e.getKeyChar();
				if((caracter < '0') || (caracter > '9')){
					e.consume();	
				}
			}
		});
		this.JEliminar.getBtnEliminar().addActionListener(a -> EventoEliminar_MenuEliminar(a));
		this.JModificar.getList().addListSelectionListener(a -> EventoCargarDatosModificar_MenuModificar(a));
		this.JModificar.getbtnModificar().addActionListener(a -> EventoModificar_MenuModificar(a));
		
	}
	
	private void eliminar(ActionEvent a) {
		this.principal.getContentPane().removeAll();
		this.principal.getContentPane().add(JEliminar);
		this.principal.getContentPane().repaint();
		this.principal.getContentPane().revalidate();
		this.cargarListaDePersonas_MenuEliminar();
	}
	
	private void listar(ActionEvent a) {
		this.principal.getContentPane().removeAll();
		this.principal.getContentPane().add(JListar);
		this.principal.getContentPane().repaint();
		this.principal.getContentPane().revalidate();
		this.JListar.llenarTabla(this.negocio.listar());
	}
	
	private void modificar(ActionEvent a) {
		this.principal.getContentPane().removeAll();
		this.principal.getContentPane().add(JModificar);
		this.principal.getContentPane().repaint();
		this.principal.getContentPane().revalidate();
		this.cargarListaDePersonas_MenuModificar();
	}
	
	private void agregar(ActionEvent a) {
		this.principal.getContentPane().removeAll();
		this.principal.getContentPane().add(JAgregar);
		this.principal.getContentPane().repaint();
		this.principal.getContentPane().revalidate();
	}
	
	public void inicializar()
	{
		
		this.principal.show();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	

	
	private void EventoAceptar_MenuAgregar(ActionEvent a) {
			int dni =  Integer.parseInt(this.JAgregar.getTxtDNI().getText());
			String nombre = this.JAgregar.getTxtNombre().getText();
			String apellido = this.JAgregar.getTxtApellido().getText();
			Persona nuevaPersona = new Persona(dni, nombre, apellido);
			String mensaje;
			
			
			if(negocio.existePersona(nuevaPersona.getDNI())) mensaje = MSG_DNI_INVALIDO;
			else if(!negocio.camposValidos(nuevaPersona)) mensaje = MSG_CAMPOS_VACIOS;
			else mensaje = negocio.agregar(nuevaPersona) ? MSG_OPERACION_EXITO : MSG_OPERACION_ERROR;
			
			this.JAgregar.mostrarMensaje(mensaje);
			
			if(mensaje == MSG_OPERACION_EXITO) {
				this.JAgregar.getTxtNombre().setText("");
				this.JAgregar.getTxtApellido().setText("");
				this.JAgregar.getTxtDNI().setText("");
			}
		
		}
	
	private void EventoEliminar_MenuEliminar(ActionEvent a) {
		int dni = JEliminar.getList().getSelectedValue().getDNI();
		
		String mensaje = negocio.eliminar(dni) ? MSG_ELIMINAR_EXITO : MSG_OPERACION_ERROR;
		
		this.JEliminar.mostrarMensaje(mensaje);
		this.cargarListaDePersonas_MenuEliminar();
		
	}
	
	private void EventoCargarDatosModificar_MenuModificar(ListSelectionEvent a) {

			if(JModificar.getList().getValueIsAdjusting()) {
				
				int dni = JModificar.getList().getSelectedValue().getDNI();
				String nombre = JModificar.getList().getSelectedValue().getNombre();
				String apellido = JModificar.getList().getSelectedValue().getApellido();
				
				this.JModificar.getTxtApellido().setText(apellido);
				this.JModificar.getTxtDni().setText(String.valueOf(dni));
				this.JModificar.getTxtNombre().setText(nombre);		
			}
		
	}
	
	private void EventoModificar_MenuModificar(ActionEvent a) {
		
		int dni = Integer.parseInt(this.JModificar.getTxtDni().getText());
		String nombre = this.JModificar.getTxtNombre().getText();
		String apellido = this.JModificar.getTxtApellido().getText();
		Persona update = new Persona(dni,nombre, apellido);
		negocio.modificar(update);
		this.JModificar.incializarTxt();
		this.cargarListaDePersonas_MenuModificar();
		
	}
	
	private void cargarListaDePersonas_MenuEliminar() {
		personasEnLista = (ArrayList<Persona>)negocio.listar();
		this.JEliminar.llenarLista(personasEnLista);
	}
	
	private void cargarListaDePersonas_MenuModificar() {
		personasEnLista = (ArrayList<Persona>)negocio.listar();
		this.JModificar.llenarLista(personasEnLista);
	}





}
