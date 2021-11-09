package presentacion.vista;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import entidades.Persona;

import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JScrollPane;

public class listar extends JPanel{
	
	
	private JTable table;
	private JScrollPane scrollPane;
	private DefaultTableModel dtModel;
	private String cols[] = {"Nombre", "Apellido", "Dni"};
	
	public listar() {
		
		setLayout(null);
		scrollPane = new JScrollPane();
		scrollPane.setBounds(76, 32, 286, 166);
		add(scrollPane);
		
		dtModel = new DefaultTableModel(null,cols);
		table = new JTable(dtModel);
		table.getColumnModel();
		table.setFont(new Font("Arial", Font.PLAIN, 14));
		table.setBounds(0, 0, 1, 1);
		scrollPane.setViewportView(table);
		
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public JScrollPane getScrollPane() {
		return scrollPane;
	}

	public void setScrollPane(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}
	
	public DefaultTableModel getModelPersonas() {
		return dtModel;
	}
	
	

	public void llenarTabla(List<Persona> personasEnTabla) {
		this.getModelPersonas().setRowCount(0); //Para vaciar la tabla
		this.getModelPersonas().setColumnCount(0);
		this.getModelPersonas().setColumnIdentifiers(cols);

		for (Persona p : personasEnTabla)
		{
			String nombre = p.getNombre();
			int dni = p.getDNI();
			String apellido = p.getApellido();
			Object[] fila = {nombre, apellido, dni};
			this.getModelPersonas().addRow(fila);
		}
		
	}
	
	

}
