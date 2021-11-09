package main;

import negocio.PersonaNegocio;
import negocioImp.PersonaNegocioImp;
import presentacion.controlador.controlador;
import presentacion.vista.ventana;

public class main {
	
public static void main(String[] args) {
		
		ventana vista = new ventana();
		PersonaNegocio negocio = new PersonaNegocioImp();
		controlador controlador = new controlador(vista, negocio);
		controlador.inicializar();
	}

}
