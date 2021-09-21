package ejercicio1;

import java.io.IOException;

public class DniInvalido extends IOException{

	public DniInvalido() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "DNI-Invalido";
	}
	
}
