import java.util.Vector;
import java.util.Arrays;
import java.util.ArrayList;

public class Vectoryarray{
	
	public static String Array(String line){
		ArrayList<String> lista = new ArrayList<String>();
		ArrayList<String> signos = new ArrayList<String>();
		
		signos.addAll(Arrays.asList("+","-","*","/"));
		
		for (String x: line.split("")) {
			if (!signos.contains(x)) {
				lista.add(0,x);
			}else {
				int a = Integer.parseInt(lista.get(0));
				lista.remove(0);
				int b = Integer.parseInt(lista.get(0));
				lista.remove(0);
				int c = signos.indexOf(x)+1;
				String respuesta = Calculos.operar(b, a, c);
				lista.add(0,respuesta);
			}
			
		}
		
		return lista.get(0);
	}

	public static String Vector(String line){
		Vector<String> vector = new Vector<String>();
		String signos = "+-*/";

		for (String x: line.split("")) {
			
			char operando = x.charAt(0);
			if (Character.isDigit(operando)) {
				vector.add(x);
			}else {
				int a = obtener(vector);
				int b = obtener(vector);
				int c = signos.indexOf(operando)+1;
				vector.add(Calculos.operar(b, a, c));
			}
		}
		return vector.lastElement();	
	}
	
	private static int obtener(Vector<String> vector) { //Obtiene un vector
		String operandoa = (String) vector.lastElement();//Obtiene el ultimo elemento
		int number = vector.lastIndexOf(operandoa); //Obtiene su posicion
		vector.remove(number); //Lo elimina del vector
		int a = Integer.parseInt(operandoa);//lo vuelve int
		return a ;//Regresa un entero
	}
}