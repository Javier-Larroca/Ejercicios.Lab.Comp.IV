package ej1_Componentes;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import javax.swing.JCheckBox;
import java.awt.Insets;
import java.awt.List;

import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JList;
import java.awt.ScrollPane;
import java.awt.Label;
import javax.swing.JScrollBar;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;

public class PanelComponentes extends JFrame {

	//Coloco todas las variables de los controles como privadas y en la parte superior
	//Para mayor organización
	
	private JCheckBox chk1;
	private JCheckBox chk2;
	private JCheckBox chk3;
	private JRadioButton rb1;
	private JRadioButton rb2;
	private JComboBox<String> comboOpciones;
	private JButton btnAceptar;
	private Label lblResJCombobox;
	private Label lblResJtxtArea;
	private JLabel lblResRadioButton;
	private JLabel lblResCheckBox;
	private JLabel lblResultadoElementosSeleccionados;
	private JPanel panel;
	private JLabel jLabel5;
	private JScrollPane scrollPane;
	private JTextArea txtArea;
	private JSpinner jSpinnerInt;
	private JSpinner jSpinnerDate;
	private JLabel labelSpinner;
	private JLabel lblResSpinnerDate;
	private JLabel lblResSpinnerInt;
	private JLabel lblControles;
	private GridBagConstraints gbc_lblControles; //Es un tipo de layout
	private Font fuenteComun;
	private JLabel labelCheckBox;
	private	JLabel labelRB;
	private JLabel labelTextArea;
	private JLabel labelCombobox;
	
	public PanelComponentes() {
		
		//Constructor de componentes	
		dibujarComponentes();
		
		//Asi trabajan los Radiobuttons, para que trabajen en conjunto hay que agruparlos con un ButtonGroup
		ButtonGroup grupoRadioButtons = new ButtonGroup();
		grupoRadioButtons.add(rb1);
		grupoRadioButtons.add(rb2);
		//Seteo el radiobuttons seleccionado
		rb1.setSelected(true);
		
	
		
		//Combobox items
		comboOpciones.addItem("Opcion1");
		comboOpciones.addItem("Opcion2");
		comboOpciones.addItem("Opcion3");
		    
		//Evento boton
		btnAceptar.addActionListener(new eventoBoton());
		
	}
	
	
	public void dibujarComponentes() {
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{30, 157, 30, 30, 30, 30, 30, 30, 30};
		gridBagLayout.rowHeights = new int[]{72, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30,30, 30, 30, 30, 30, 30, 30, 30};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		lblControles = new JLabel("CONTROLES");
		lblControles.setFont(new Font("Tahoma", Font.BOLD, 22));
		gbc_lblControles = new GridBagConstraints();
		gbc_lblControles.insets = new Insets(0, 0, 5, 5);
		gbc_lblControles.gridx = 1;
		gbc_lblControles.gridy = 0;
		getContentPane().add(lblControles, gbc_lblControles);
		
		
		fuenteComun = new Font("Tahoma", Font.PLAIN, 22);
		
		labelCheckBox = new JLabel("JCheckBox");
		labelCheckBox.setFont(fuenteComun);
		GridBagConstraints gbc_jLabel1 = new GridBagConstraints();
		gbc_jLabel1.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel1.gridx = 1;
		gbc_jLabel1.gridy = 1;
		getContentPane().add(labelCheckBox, gbc_jLabel1);
		
		chk1 = new JCheckBox("CheckBox1");
		chk1.setFont(fuenteComun);
		GridBagConstraints gbc_chk1 = new GridBagConstraints();
		gbc_chk1.anchor = GridBagConstraints.WEST;
		gbc_chk1.insets = new Insets(0, 0, 5, 5);
		gbc_chk1.gridx = 4;
		gbc_chk1.gridy = 1;
		getContentPane().add(chk1, gbc_chk1);
		
		chk2 = new JCheckBox("CheckBox2");
		chk2.setFont(fuenteComun);
		GridBagConstraints gbc_chk2 = new GridBagConstraints();
		gbc_chk2.anchor = GridBagConstraints.WEST;
		gbc_chk2.insets = new Insets(0, 0, 5, 5);
		gbc_chk2.gridx = 5;
		gbc_chk2.gridy = 1;
		getContentPane().add(chk2, gbc_chk2);
		
		chk3 = new JCheckBox("CheckBox3");
		chk3.setFont(fuenteComun);
		GridBagConstraints gbc_chk3 = new GridBagConstraints();
		gbc_chk3.anchor = GridBagConstraints.WEST;
		gbc_chk3.insets = new Insets(0, 0, 5, 5);
		gbc_chk3.gridx = 6;
		gbc_chk3.gridy = 1;
		getContentPane().add(chk3, gbc_chk3);
		
		labelRB = new JLabel("JRadioButton");
		labelRB.setFont(fuenteComun);
		GridBagConstraints gbc_jLabel2 = new GridBagConstraints();
		gbc_jLabel2.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel2.gridx = 1;
		gbc_jLabel2.gridy = 2;
		getContentPane().add(labelRB, gbc_jLabel2);
		
		rb1 = new JRadioButton("RadioButton1");
		rb1.setFont(fuenteComun);
		GridBagConstraints gbc_rb1 = new GridBagConstraints();
		gbc_rb1.anchor = GridBagConstraints.WEST;
		gbc_rb1.insets = new Insets(0, 0, 5, 5);
		gbc_rb1.gridx = 4;
		gbc_rb1.gridy = 2;
		getContentPane().add(rb1, gbc_rb1);
		
		rb2 = new JRadioButton("RadioButton2");
		rb2.setFont(fuenteComun);
		GridBagConstraints gbc_rb2 = new GridBagConstraints();
		gbc_rb2.anchor = GridBagConstraints.WEST;
		gbc_rb2.insets = new Insets(0, 0, 5, 5);
		gbc_rb2.gridx = 5;
		gbc_rb2.gridy = 2;
		getContentPane().add(rb2, gbc_rb2);
		
		labelTextArea = new JLabel("JTextArea");
		labelTextArea.setFont(fuenteComun);
		GridBagConstraints gbc_jLabel3 = new GridBagConstraints();
		gbc_jLabel3.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel3.gridx = 1;
		gbc_jLabel3.gridy = 3;
		getContentPane().add(labelTextArea, gbc_jLabel3);
		
		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 3;
		gbc_scrollPane.gridwidth = 3;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 4;
		gbc_scrollPane.gridy = 3;
		getContentPane().add(scrollPane, gbc_scrollPane);
		
		txtArea = new JTextArea();
		txtArea.setFont(fuenteComun);
		scrollPane.setViewportView(txtArea);
		
		labelCombobox = new JLabel("JCombobox");
		labelCombobox.setFont(fuenteComun);
		GridBagConstraints gbc_jLabel4 = new GridBagConstraints();
		gbc_jLabel4.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel4.gridx = 1;
		gbc_jLabel4.gridy = 6;
		getContentPane().add(labelCombobox, gbc_jLabel4);
		
		comboOpciones = new JComboBox<String>();
		comboOpciones.setFont(fuenteComun);
		GridBagConstraints gbc_comboOpciones = new GridBagConstraints();
		gbc_comboOpciones.gridwidth = 3;
		gbc_comboOpciones.insets = new Insets(0, 0, 5, 5);
		gbc_comboOpciones.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboOpciones.gridx = 4;
		gbc_comboOpciones.gridy = 6;
		getContentPane().add(comboOpciones, gbc_comboOpciones);
		
		jLabel5 = new JLabel("JSpinner Int");
		jLabel5.setFont(fuenteComun);
		GridBagConstraints gbc_jLabel5 = new GridBagConstraints();
		gbc_jLabel5.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel5.gridx = 1;
		gbc_jLabel5.gridy = 7;
		getContentPane().add(jLabel5, gbc_jLabel5);
		
		jSpinnerInt = new JSpinner();
		jSpinnerInt.setFont(fuenteComun);
		jSpinnerInt.setModel(new SpinnerNumberModel(10, 10, 100, 5));
		GridBagConstraints gbc_jSpinnerInt = new GridBagConstraints();
		gbc_jSpinnerInt.anchor = GridBagConstraints.WEST;
		gbc_jSpinnerInt.gridwidth = 1;
		gbc_jSpinnerInt.insets = new Insets(0, 0, 5, 5);
		gbc_jSpinnerInt.gridx = 4;
		gbc_jSpinnerInt.gridy = 7;
		getContentPane().add(jSpinnerInt, gbc_jSpinnerInt);
		
		labelSpinner = new JLabel("JSpinner Date");
		labelSpinner.setFont(fuenteComun);
		GridBagConstraints gbc_jLabel6 = new GridBagConstraints();
		gbc_jLabel6.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel6.gridx = 1;
		gbc_jLabel6.gridy = 8;
		getContentPane().add(labelSpinner, gbc_jLabel6);
		
		jSpinnerDate = new JSpinner();
		jSpinnerDate.setFont(fuenteComun);
		jSpinnerDate.setModel(new SpinnerDateModel(new Date(1520910000000L), null, new Date(1552446000000L), Calendar.DAY_OF_YEAR));
		GridBagConstraints gbc_jSpinnerDate = new GridBagConstraints();
		gbc_jSpinnerDate.anchor = GridBagConstraints.WEST;
		gbc_jSpinnerDate.gridwidth = 2;
		gbc_jSpinnerDate.insets = new Insets(0, 0, 5, 5);
		gbc_jSpinnerDate.gridx = 4;
		gbc_jSpinnerDate.gridy = 8;
		getContentPane().add(jSpinnerDate, gbc_jSpinnerDate);
		
		GridBagConstraints gbc_btnAceptar = new GridBagConstraints();
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(fuenteComun);
		gbc_btnAceptar.gridwidth = 2;
		gbc_btnAceptar.insets = new Insets(0, 0, 5, 5);
		gbc_btnAceptar.gridx = 6;
		gbc_btnAceptar.gridy = 8;
		getContentPane().add(btnAceptar, gbc_btnAceptar);
		
		
		lblResultadoElementosSeleccionados = new JLabel("RESULTADO ELEMENTOS SELECCIONADOS");
		lblResultadoElementosSeleccionados.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_lblResultadoElementosSeleccionados = new GridBagConstraints();
		gbc_lblResultadoElementosSeleccionados.gridwidth = 4;
		gbc_lblResultadoElementosSeleccionados.insets = new Insets(0, 0, 5, 5);
		gbc_lblResultadoElementosSeleccionados.gridx = 1;
		gbc_lblResultadoElementosSeleccionados.gridy = 10;
		getContentPane().add(lblResultadoElementosSeleccionados, gbc_lblResultadoElementosSeleccionados);
		
		
		panel = new JPanel();
		panel.setLayout(null);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridheight = 9;
		gbc_panel.gridwidth = 7;
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 11;
		getContentPane().add(panel, gbc_panel);
		
		lblResRadioButton = new JLabel("JRadioButton: ");
		lblResRadioButton.setBounds(27, 54, 688, 27);
		panel.add(lblResRadioButton);
		lblResRadioButton.setFont(fuenteComun);
		lblResRadioButton.setForeground(Color.red);
		
		lblResJtxtArea = new Label("JTextArea:");
		lblResJtxtArea.setBounds(27, 87, 662, 34);
		panel.add(lblResJtxtArea);
		lblResJtxtArea.setFont(fuenteComun);
		lblResJtxtArea.setForeground(Color.red);
		
		//Labels para resultados:
		
		lblResCheckBox = new JLabel("JCheckBox:");
		lblResCheckBox.setBounds(27, 16, 662, 27);
		panel.add(lblResCheckBox);
		lblResCheckBox.setFont(fuenteComun);
		lblResCheckBox.setForeground(Color.red);
		
		lblResJCombobox = new Label("JComboBox:");
		lblResJCombobox.setBounds(27, 126, 676, 34);
		panel.add(lblResJCombobox);
		lblResJCombobox.setFont(fuenteComun);
		lblResJCombobox.setForeground(Color.red);
		
		lblResSpinnerInt = new JLabel("JSpinner Int:");
		lblResSpinnerInt.setFont(fuenteComun);
		lblResSpinnerInt.setForeground(Color.red);
		lblResSpinnerInt.setBounds(27, 166, 706, 20);
		panel.add(lblResSpinnerInt);
		
		lblResSpinnerDate = new JLabel("JSpinner Date:");
		lblResSpinnerDate.setBounds(27, 202, 716, 20);
		lblResSpinnerDate.setFont(fuenteComun);
		lblResSpinnerDate.setForeground(Color.red);
		panel.add(lblResSpinnerDate);
	}
		 

	class eventoBoton implements ActionListener
	{

		public void actionPerformed(ActionEvent arg0) {
			
			String mensaje="";
			//Checkbox
			if(chk1.isSelected())
			{
				mensaje+= chk1.getText()+ " ";
			}
			
			if(chk2.isSelected())
			{
				mensaje+=chk2.getText()+ " ";
			}
			
			if(chk3.isSelected())
			{
				mensaje+=chk3.getText()+ " ";
			}
			lblResCheckBox.setText("JCheckBox: "+mensaje);
			
			//RadioButtons
			mensaje = "";
			if(rb1.isSelected())
			{
				mensaje+= rb1.getText()+ " ";
			}
			if(rb2.isSelected())
			{
				mensaje+= rb2.getText();
			}
			lblResRadioButton.setText("JRadioButton: "+mensaje);
			lblResJtxtArea.setText("JTextArea: "+txtArea.getText());
			lblResJCombobox.setText("JComboBox: "+comboOpciones.getSelectedItem());		
			lblResSpinnerInt.setText("JSpinner Int:"+jSpinnerInt.getValue());
			lblResSpinnerDate.setText("JSpinner Date:"+jSpinnerDate.getValue());
		}
	}
}
