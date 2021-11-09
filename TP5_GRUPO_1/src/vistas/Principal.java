package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import clases.Peliculas;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	private AgregarPeliculas JPAgregar;
	private ListarPeliculas JPListar;
	private JMenuBar menuBar;
	private JMenu mnPeliculas;
	private JMenuItem mntmAgregar;
	private JMenuItem mntmListar;
	
	private static DefaultListModel<Peliculas> listPelicula;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					listPelicula = new DefaultListModel<Peliculas>();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 735, 536);
		
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
				sortModel(listPelicula);
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
	
	private void sortModel(DefaultListModel<Peliculas> model) {
		ArrayList<Peliculas> list = new ArrayList<Peliculas>();
	    for (int i = 0; i < model.size(); i++) {
	        list.add((Peliculas)model.get(i));
	    }
	    Collections.sort(list);
	    model.removeAllElements();
	    for (Peliculas s : list) {
	        model.addElement(s);
	    }
   
	}
	
}
