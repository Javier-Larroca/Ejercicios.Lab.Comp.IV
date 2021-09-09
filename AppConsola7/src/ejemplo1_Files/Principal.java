package ejemplo1_Files;

public class Principal {

		public static void main(String[] args) {
			
			Archivo archivo = new Archivo();
			archivo.setRuta("prueba.txt");
			
			if(archivo.existe())
			{
				System.out.println("Existe archivo");
			}
			else
			{
				System.out.println("No existe archivo entonces lo creo");
				archivo.creaArchivo();
			}
			
			//ESCRITURA:
			archivo.escribe_letra_x_letra(" Bienvenidos a Laboratorio ");
			archivo.escribe_lineas("\n Universidad Tecnologica Nacional");
		
			//LECTURA:
			
			System.out.println("\n A CONTINUACIÓN LEE LA INFORMACION DEL ARCHIVO LETRA POR LETRA: ");
			archivo.lee_letra_x_letra();
			
			System.out.println("\n A CONTINUACIÓN LEE DE A LINEAS: ");
			archivo.lee_lineas();
		}
	}

