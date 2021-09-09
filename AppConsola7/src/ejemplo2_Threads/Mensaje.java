package ejemplo2_Threads;

public class Mensaje implements Runnable {

	private String texto;

	public Mensaje()
	{
		
	}

	public Mensaje(String texto) {
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	@Override
	public void run() {
		for(int i=1;i<=10;i++)
		{
			System.out.println(texto+"- Se envia el mensaje a la persona"+i);
		}
	}

}
