/****************************************
 * Oscar Fernando López Barrios 20679
 * Jose Pablo Monzon 20309
 * Estructuras de Datos
 * 28-02-2021
 ****************************************/

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

//Se crea la clase Lector
public class Lector {

	
	/** 
	 * @return String se regresa la linea del texto
	 */
	//Se crea la clase leer
	public static String leer(){
		
		File file = new File("Datos.txt");
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String linea;
			linea = br.readLine();
			br.close();
			if (linea != null) {
				return linea;
			}
		} catch (Exception e) {
			System.out.println("Ha ocurrido un error al leer el archivo, intente otra vez");
			System.exit(0);
		}
		return "";
	}
	
}
	

