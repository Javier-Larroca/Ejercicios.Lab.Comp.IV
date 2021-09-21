package ej2_Cuadro;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class Frame extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;
	private JPanel panel;
	private JLabel lbl1_panel1;
	private JLabel lbl2_panel;
	/**
	 * Create the frame.
	 */
	public Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 414, 255);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		panel = new JPanel();
		
		//Crear un tipo de borde
		BevelBorder borde = new BevelBorder(BevelBorder.LOWERED, null, null, null, null);
		//Le agrego el titulo
		Border bordeConTitulo = BorderFactory.createTitledBorder(borde, "TITULO 1", TitledBorder.LEFT, TitledBorder.TOP, null, Color.BLUE);
		//Agrego el borde con titulo al panel
		panel.setBorder(bordeConTitulo);
		
		
		panel.setBounds(23, 27, 358, 161);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lbl1_panel1 = new JLabel("Soy un panel con un borde y un t\u00EDtulo");
		lbl1_panel1.setBounds(65, 33, 236, 16);
		panel.add(lbl1_panel1);
		
		lbl2_panel = new JLabel("Tengo seteado absolute layout");
		lbl2_panel.setBounds(75, 62, 217, 16);
		panel.add(lbl2_panel);
		
		txt1 = new JTextField();
		txt1.setBounds(28, 106, 116, 22);
		panel.add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setBounds(185, 106, 116, 22);
		panel.add(txt2);
		txt2.setColumns(10);
	}
}
