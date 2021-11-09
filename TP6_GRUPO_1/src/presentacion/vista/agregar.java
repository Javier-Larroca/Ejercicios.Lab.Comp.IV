package presentacion.vista;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class agregar extends JPanel {
	
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDNI;
	private JLabel lblDni;
	private JLabel lblNombre;
	private JLabel lblApellido;
	private JButton btnAceptar;
	
	
	public agregar() {
		
		setLayout(null);
		
		lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Arial", Font.PLAIN, 14));
		lblApellido.setBounds(115, 82, 77, 14);
		add(lblApellido);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNombre.setBounds(115, 37, 64, 14);
		add(lblNombre);
		
		lblDni = new JLabel("DNI");
		lblDni.setFont(new Font("Arial", Font.PLAIN, 14));
		lblDni.setBounds(115, 116, 46, 24);
		add(lblDni);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Arial", Font.PLAIN, 14));
		txtNombre.setBounds(215, 35, 86, 20);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setFont(new Font("Arial", Font.PLAIN, 14));
		txtApellido.setBounds(215, 79, 86, 20);
		add(txtApellido);
		txtApellido.setColumns(10);
		
		txtDNI = new JTextField();
		txtDNI.setFont(new Font("Arial", Font.PLAIN, 14));
		txtDNI.setBounds(215, 118, 86, 20);
		add(txtDNI);
		txtDNI.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnAceptar.setBounds(172, 173, 89, 23);
		add(btnAceptar);
	}
	
	public JButton getBtnAceptar() 
	{
		return btnAceptar;
	}
	
	public JTextField getTxtDNI() {
		return txtDNI;
	}

	public void setTxtDNI(JTextField dni) {
		this.txtDNI = dni;
	}
	
	public JTextField getTxtNombre()
	{
		return txtNombre;
	}
	
	public void setTxtNombre(JTextField nombre) {
		this.txtNombre = nombre;
	}
	
	public JTextField getTxtApellido() {
		return txtApellido;
	}

	public void setTxtApellido(JTextField apellido) {
		this.txtApellido = apellido;
	}
	
	public void mostrarMensaje(String mensaje)
	{
		JOptionPane.showMessageDialog(null, mensaje);
	}
}
