package ejemplo2_Threads;

public class Principal {

	public static void main(String[] args) {

		Mensaje msj1 = new Mensaje("Este es el mensaje 1 ");
		
		Mensaje msj2 = new Mensaje("Este es el mensaje 2");
		
		Mensaje msj3 = new Mensaje("Este es el mensaje 3");
		
		Thread hilo1 = new Thread(msj1);
		Thread hilo2 = new Thread(msj2);
		Thread hilo3 = new Thread(msj3);
		
		hilo1.start();
		hilo2.start();
		hilo3.start();
		
	}

}
