package presentacion.vista;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

import entidades.Persona;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Font;
import java.util.List;

import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class modificar extends JPanel {
	
	private JList<Persona> list;
	private JScrollPane scrollPane; 
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDni;
	private JButton btnModificar;
	private DefaultListModel<Persona> modelPersona;
	
	public modificar() {
		setLayout(null);	
		modelPersona = new DefaultListModel<Persona>();
		scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 50, 280, 100);
		add(scrollPane);
		
		list = new JList<Persona>();
		list.setFont(new Font("Arial", Font.PLAIN, 14));
		list.setModel(modelPersona);
		scrollPane.setViewportView(list);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Arial", Font.PLAIN, 14));
		txtNombre.setBounds(30, 189, 86, 20);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setFont(new Font("Arial", Font.PLAIN, 14));
		txtApellido.setBounds(126, 189, 86, 20);
		add(txtApellido);
		txtApellido.setColumns(10);
		
		txtDni = new JTextField();
		txtDni.setEditable(false);
		txtDni.setFont(new Font("Arial", Font.PLAIN, 14));
		txtDni.setBounds(222, 189, 86, 20);
		add(txtDni);
		txtDni.setColumns(10);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnModificar.setBounds(318, 188, 122, 23);
		add(btnModificar);
	}

	public JScrollPane getScrollPane() {
		return scrollPane;
	}

	public void setScrollPane(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JTextField getTxtApellido() {
		return txtApellido;
	}

	public void setTxtApellido(JTextField txtApellido) {
		this.txtApellido = txtApellido;
	}

	public JTextField getTxtDni() {
		return txtDni;
	}

	public void setTxtDni(JTextField txtDni) {
		this.txtDni = txtDni;
	}

	public JButton getBtnModificar() {
		return btnModificar;
	}

	public void setBtnModificar(JButton btnModificar) {
		this.btnModificar = btnModificar;
	}

	public DefaultListModel<Persona> getModelPersona() {
		return modelPersona;
	}

	public void setModelPersona(DefaultListModel<Persona> modelPersona) {
		this.modelPersona = modelPersona;
	}

	public void setList(JList<Persona> list) {
		this.list = list;
	}
	

	public DefaultListModel<Persona> getDefaultList(){
		return modelPersona;
	}
		
	public void mostrarMensaje(String mensaje)
	{
		JOptionPane.showMessageDialog(null, mensaje);
	}
	
	public void llenarLista(List<Persona> personas) 
	{
		//Limpiamos DefaultListModel
		this.getDefaultList().clear();
		
		//Cargamos DefaultListModel
		for (Persona p : personas)
		{
			this.getDefaultList().addElement(new Persona(p.getDNI(), p.getNombre(), p.getApellido()));
		}
	}
	
	public JButton getbtnModificar() {
		return btnModificar;
	}
	
	public JScrollPane getPanel() {
		return scrollPane;
	}
	
	public JList<Persona> getList() {
		return list;
	}

	public void incializarTxt() {
		this.txtApellido.setText("");
		this.txtDni.setText("");
		this.txtNombre.setText("");
	}
}
