package vistas;

import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import clases.Peliculas;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;

public class ListarPeliculas extends JPanel {

	private static final long serialVersionUID = 1L;
	private DefaultListModel<Peliculas> listPelicula;
	private JList<Peliculas> list;
	private JScrollPane scrollPane;
	

	public ListarPeliculas() {
		Font fuenteComun = new Font("Tahoma", Font.PLAIN, 22);
		
		JLabel lblListado = new JLabel("Libros disponibles");
		lblListado.setFont(fuenteComun);
		setLayout(null);

		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(180, 30, 400, 400);
		add(scrollPane);
		
		list = new JList<Peliculas>();
		list.setFont(new Font("Tahoma", Font.PLAIN, 15));
		scrollPane.setViewportView(list);
		
		JLabel lblNewLabel_1 = new JLabel("Pel\u00EDculas");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(39, 186, 101, 65);
		add(lblNewLabel_1);

	}
	
	public DefaultListModel<Peliculas> getListPelicula() {
		return listPelicula;
	}


	public void setListPelicula(DefaultListModel<Peliculas> listPelicula) {
		System.out.println(listPelicula.toString());
		this.listPelicula = listPelicula;
		list.setModel(this.listPelicula);

	}
}
