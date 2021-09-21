package TP4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	private Ejercicio1 ejercicio1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("TP4 Escritorio");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGrupo = new JLabel("Grupo 1");
		lblGrupo.setFont(new Font("Arial", Font.BOLD, 16));
		lblGrupo.setBounds(188, 45, 70, 22);
		contentPane.add(lblGrupo);
		
		JButton btnEjercicio1 = new JButton("EJERCICIO 1");
		btnEjercicio1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ejercicio1 = new Ejercicio1();
				ejercicio1.setVisible(true);
				
				
			}
		});
		btnEjercicio1.setBounds(172, 80, 104, 23);
		contentPane.add(btnEjercicio1);
		
		JButton btnEjercicio2 = new JButton("EJERCICIO 2");
		btnEjercicio2.setBounds(172, 114, 104, 23);
		contentPane.add(btnEjercicio2);
		
		JButton btnEjercicio3 = new JButton("EJERCICIO 3");
		btnEjercicio3.setBounds(172, 148, 104, 23);
		contentPane.add(btnEjercicio3);
	}
}
