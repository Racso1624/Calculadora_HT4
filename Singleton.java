public class Singleton {

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

