public class Singleton {

	public static String operar(int op1, int op2, int operacion) {
		String resultado;

		switch (operacion) {
			case 1:
				resultado = String.valueOf(op1 + op2);
				return resultado;
			case 2:
				resultado = String.valueOf(op1 - op2);
				return resultado;
			case 3:
				resultado = String.valueOf(op1 * op2);
				return resultado;
			case 4:
				resultado = String.valueOf(op1 / op2);
				return resultado;
			default:
				return "0";
		}


	}

}

