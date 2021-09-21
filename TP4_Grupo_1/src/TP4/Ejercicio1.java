package TP4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Ejercicio1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtTelefono;
	private JTextField txtNacimiento;

	public void limpiarTxt(){
		txtNombre.setText("");
		txtApellido.setText("");
		txtTelefono.setText("");
		txtNacimiento.setText("");
	}
	
	public int verificarContenido() {
		int cont = 0;
		
		if(txtNombre.getText().trim().length() == 0) {
			cont++;
			txtNombre.setBackground(Color.red);
		}
		if(txtApellido.getText().trim().length() == 0) {
			cont++;
			txtApellido.setBackground(Color.red);
		}
		if(txtTelefono.getText().trim().length() == 0) {
			cont++;
			txtTelefono.setBackground(Color.red);
		}
		if(txtNacimiento.getText().trim().length() == 0) {
			cont++;
			txtNacimiento.setBackground(Color.red);
		}
		
		return cont;
	}

	
	public Ejercicio1() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 500, 355);
		setTitle("Contactos");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(49, 24, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(49, 61, 46, 14);
		contentPane.add(lblApellido);
		
		JLabel lblTelfono = new JLabel("Tel\u00E9fono");
		lblTelfono.setBounds(49, 99, 46, 14);
		contentPane.add(lblTelfono);
		
		JLabel lblFechaDeNac = new JLabel("Fecha de nac.");
		lblFechaDeNac.setBounds(49, 142, 74, 14);
		contentPane.add(lblFechaDeNac);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(132, 21, 115, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);

		
		txtApellido = new JTextField();
		txtApellido.setBounds(132, 58, 115, 20);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(132, 96, 115, 20);
		contentPane.add(txtTelefono);
		txtTelefono.setColumns(10);
		

		txtNacimiento = new JTextField();
		txtNacimiento.setBounds(132, 139, 115, 20);
		contentPane.add(txtNacimiento);
		txtNacimiento.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Los datos ingresados fueron: ");
		lblNewLabel.setBounds(10, 201, 166, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setBounds(10, 227, 414, 20);
		contentPane.add(lblResultado);
		
		JLabel lblResultado2 = new JLabel("");
		lblResultado2.setBounds(10, 258, 454, 23);
		contentPane.add(lblResultado2);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.setBounds(304, 104, 108, 52);
		contentPane.add(btnMostrar);
		
		txtNombre.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				
				if(txtNombre.getBackground() == Color.red) {
					txtNombre.setBackground(Color.white);
				}
				
			}
		});
		
		txtApellido.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				if(txtApellido.getBackground() == Color.red) {
					txtApellido.setBackground(Color.white);
				}
				
			}
		});
		txtTelefono.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(txtTelefono.getBackground() == Color.red) {
					txtTelefono.setBackground(Color.white);
				}
				
			}
		});
		txtNacimiento.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(txtNacimiento.getBackground() == Color.red) {
					txtNacimiento.setBackground(Color.white);
				}
			}
		});
		

		
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int cont = verificarContenido();
				
				if(cont == 0) {					
					lblResultado.setText("Nombre y apellido: " + txtNombre.getText() + ", " + txtApellido.getText());
					lblResultado2.setText("Teléfono: " + txtTelefono.getText() + ", Fecha de nacimiento: " + txtNacimiento.getText());			
					limpiarTxt();
				}

			}
		});
		
		
		
	}
}
