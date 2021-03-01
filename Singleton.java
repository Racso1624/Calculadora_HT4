/****************************************
 * Oscar Fernando López Barrios 20679
 * Jose Pablo Monzon 20309
 * Estructuras de Datos
 * 28-02-2021
 ****************************************/

 //Se crea la clase Singleton
public class Singleton {

	
	/** 
	 * @param op1 se ingresa el numero 1
	 * @param op2 se ingresa el numero 2
	 * @param operacion se ingresa el numero de la operacion
	 * @return int se regresa el resultado
	 */
	public static int operar(int op1, int op2, int operacion) {
		int resultado;

		switch (operacion) {
			case 1:
				resultado = op1 + op2;
				return resultado;
			case 2:
				resultado = op1 - op2;
				return resultado;
			case 3:
				resultado = op1 * op2;
				return resultado;
			case 4:
				resultado = op1 / op2;
				return resultado;
			default:
				return 0;
		}


	}

}

