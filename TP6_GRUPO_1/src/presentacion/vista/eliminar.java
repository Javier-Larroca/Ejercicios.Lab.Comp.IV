package presentacion.vista;

import javax.swing.JPanel;

import java.awt.Font;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

import entidades.Persona;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class eliminar extends JPanel{
	
	private JScrollPane scrollPane;
	private JList<Persona> list;
	private DefaultListModel<Persona> modelPersona;
	private JButton btnEliminar;
	
	public eliminar() {
		setLayout(null);
		
		JLabel lblEliminarPersona = new JLabel("Eliminar Persona");
		lblEliminarPersona.setFont(new Font("Arial", Font.PLAIN, 14));
		lblEliminarPersona.setBounds(170, 5, 153, 14);
		add(lblEliminarPersona);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(50, 30, 350, 150);
		add(scrollPane);
		
		modelPersona = new DefaultListModel<Persona>();
		
		list = new JList<Persona>();
		list.setFont(new Font("Arial", Font.PLAIN, 14));
		scrollPane.setViewportView(list);
		list.setModel(modelPersona);
		
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnEliminar.setBounds(186, 191, 89, 23);
		add(btnEliminar);
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
	
	public JButton getBtnEliminar() {
		return btnEliminar;
	}
	
	
	public JScrollPane getPanel() {
		return scrollPane;
	}
	
	public JList<Persona> getList() {
		return list;
	}
}
