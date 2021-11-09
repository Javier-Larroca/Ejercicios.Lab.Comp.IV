package vistas;

import javax.swing.JPanel;
import javax.swing.JTextPane;

import clases.Categorias;
import clases.Peliculas;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Font;

public class AgregarPeliculas extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private DefaultListModel<Peliculas> listPelicula;
	private Categorias categorias;
	private JTextPane txtNombre;
	private JButton btnEnviar;
	private JLabel lblid;
	private JLabel lblID;
	private JLabel lblNombre;
	private JLabel lblGenero;
	private JComboBox<Categorias> cbGenero;

	
	public AgregarPeliculas() {
		txtNombre = new JTextPane();
		txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtNombre.setBounds(280, 159, 216, 39);
		lblid = new JLabel("ID");
		lblid.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblid.setBounds(97, 84, 34, 39);
		lblID = new JLabel("");
		lblID.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblID.setBounds(279, 84, 70, 39);
		lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNombre.setBounds(95, 159, 80, 25);
		lblGenero = new JLabel("Genero");
		lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGenero.setBounds(97, 225, 70, 47);
		cbGenero = new JComboBox<Categorias>();
		cbGenero.setBounds(280, 233, 216, 39);
		btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(312, 356, 162, 57);
		setLayout(null);
		add(txtNombre);
		add(lblid);
		
		lblID.setText(String.valueOf(Peliculas.getContador()+1));
		add(lblID);
		add(lblNombre);
		add(lblGenero);
		add(cbGenero);
		AgregarCBGenero();
		add(btnEnviar);
		
		
		//Eventos
		txtNombre.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if(txtNombre.getBackground() == Color.red)
				{
					txtNombre.setBackground(Color.white);
				}
			}
		});
		
		
		cbGenero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cbGenero.getBackground() == Color.red)
				{
					cbGenero.setBackground(Color.white);
				}
			}
		});
		
		
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(Verificar())
				{
					btnAceptar();
				}
				
			}
		});
		
	}
	
	public void AgregarCBGenero()
	{
		cbGenero.addItem(new Categorias(1, "Seleccione un genero"));
		cbGenero.addItem(new Categorias(2, "Terror"));
		cbGenero.addItem(new Categorias(3, "Accion"));
		cbGenero.addItem(new Categorias(4, "Suspenso"));
		cbGenero.addItem(new Categorias(5, "Romantica"));
	}
	
	public boolean Verificar()
	{
		String mensaje= "Falta ingresar - ";
		int cont = 0;
		categorias = (Categorias)cbGenero.getSelectedItem();
		if(txtNombre.getText().isEmpty())
		{
			cont ++;
			txtNombre.setBackground(Color.red);
			txtNombre.setText("");
			mensaje += " Nombre Pelicula -";
		}
		if(categorias.getID() == 1)
		{
			cbGenero.setBackground(Color.red);
			cont ++;
			mensaje += " Genero";
		}
		if(cont != 0) 
		{ 
			JOptionPane.showMessageDialog(null, mensaje);
			return false;
		}
		return true;
	}
	
	public void btnAceptar()
	{
		Peliculas peliculas = new Peliculas();
		peliculas.setNombre(txtNombre.getText());
		peliculas.setCategoria((Categorias)cbGenero.getSelectedItem());
		listPelicula.addElement(peliculas);
		
		JOptionPane.showMessageDialog(null, "Pelicula agregada");
		lblID.setText(String.valueOf(Peliculas.getContador()+1));
		txtNombre.setText("");
		cbGenero.setSelectedIndex(0);
		
		
	}

	public DefaultListModel<Peliculas> getListPelicula() {
		return listPelicula;
	}

	public void setListPelicula(DefaultListModel<Peliculas> listPelicula) {
		this.listPelicula = listPelicula;
	}
	
	
}
