import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

public class Lector {
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
	

