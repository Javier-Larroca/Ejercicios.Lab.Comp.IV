package ejemplo2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JButton boton;
	private JTextField txtNombre;
	
	public Ventana()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setLocation(350,350);
		setTitle("Titulo 2");
		getContentPane().setLayout(null);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(63, 33, 200, 36);
		
		boton = new JButton();
		boton.setText("Aceptar");
		boton.setBounds(106,98, 140,30);
		
		//Pasarlo por el constructor
		//boton.addActionListener(new eventoBoton(txtNombre));

		//Pasarlo por el set
		eventoBoton eventoB = new eventoBoton();
		eventoB.setTxtNombre(txtNombre);
		boton.addActionListener(eventoB);
		
		
		getContentPane().add(boton);	
		getContentPane().add(txtNombre);
		
	}
	
	public void cambiarVisibilidad(boolean estado)
	{
		setVisible(true);
	}
}


class eventoBoton implements ActionListener
{

	private JTextField txtNombre;
	
	public eventoBoton()
	{
		
	}
	
	public eventoBoton(JTextField txt)
	{
		txtNombre = txt;
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Hola "+txtNombre.getText());
	}
	
}
