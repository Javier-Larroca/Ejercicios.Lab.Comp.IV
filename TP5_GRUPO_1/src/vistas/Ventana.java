package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Peliculas;
import clases.Categorias;
import principal.Principal;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private AgregarPeliculas JPAgregar;
	private ListarPeliculas JPListar;
	private JMenuBar menuBar;
	private JMenu mnPeliculas;
	private JMenuItem mntmAgregar;
	private JMenuItem mntmListar;
	
	private static DefaultListModel<Peliculas> listPelicula;
	

	/**
	 * Create the frame.
	 */
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		listPelicula = new DefaultListModel<Peliculas>();
		
		menuBar = new JMenuBar();
		mnPeliculas = new JMenu("Peliculas");
		mnPeliculas = new JMenu("Peliculas");
		mntmAgregar = new JMenuItem("Agregar");
		mntmListar = new JMenuItem("Listar");
		
		setJMenuBar(menuBar);
		menuBar.add(mnPeliculas);
		
		
		mntmAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				contentPane.removeAll();
				JPAgregar = new AgregarPeliculas();
				JPAgregar.setListPelicula(listPelicula);
				contentPane.add(JPAgregar);
				contentPane.repaint();
				contentPane.revalidate();
				
			}
		});
		mnPeliculas.add(mntmAgregar);
		
		mntmListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contentPane.removeAll();
				JPListar = new ListarPeliculas();
				JPListar.setListPelicula(listPelicula);
				contentPane.add(JPListar);
				contentPane.repaint();
				contentPane.revalidate();
				
			}
		});
		mnPeliculas.add(mntmListar);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
	
}
