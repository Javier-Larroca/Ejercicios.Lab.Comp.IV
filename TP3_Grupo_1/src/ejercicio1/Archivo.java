package ejercicio1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Archivo {

	public Archivo() {
		// TODO Auto-generated constructor stub
	}
	
	public String leer(String ruta)
	{
		String frase = "";
		try{

			FileReader entrada = new FileReader(ruta);
			BufferedReader miBuffer = new BufferedReader(entrada);

			String linea = miBuffer.readLine();

			while(linea != null)
			{
				frase += linea;
				frase += "\n";
				linea = miBuffer.readLine();
			}
			
			entrada.close();
		
		}catch(Exception e){
			e.printStackTrace();
		}
		return frase;
	}
	
	public void generarResultado (Persona nueva)
	{
		try{
			FileWriter fw = new FileWriter("Resultado.txt", true);
			BufferedWriter miBuffer = new BufferedWriter(fw);
			
			miBuffer.write(nueva.toString());		

			miBuffer.close();
			fw.close();
		
		}catch (IOException e){
			e.printStackTrace();
		}
	}
	
	
		
}


