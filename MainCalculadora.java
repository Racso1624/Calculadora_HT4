/**
 * MainCalculadora
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainCalculadora {

	public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);
		
		String prelinea = Lector.leer();

		String linea = Intopostfix.infixToPostfix(prelinea);
		
		String respuesta;
			
		System.out.println("\n\nBienvenido a la Calculadora");
		
		boolean var = false;
        while(var == false){

            System.out.println("\n\nIngrese la clase de implementacion que desea ");
            System.out.println("1) ArrayList");
            System.out.println("2) Vector");
            System.out.println("3) Lista simplemente encadenada");
            System.out.println("4) Lista doblemente encadenada");
            System.out.println("5) Salir");

            try {
                
                int opcion = scanner.nextInt();
                switch (opcion) {
					case 1:
						respuesta = Vectoryarray.Array(linea);
						System.out.println("La respuesta a " + prelinea + " es " + respuesta);
						System.out.println("Este procedimiento fue hecho con ArrayList");
						continue;
					case 2:
						respuesta =  Vectoryarray.Vector(linea);
						System.out.println("La respuesta a " + prelinea + " es " + respuesta);
						System.out.println("Este procedimiento fue hecho con Vector");
						continue;
					case 3:
						continue;
					case 4:
						continue;
					case 5:
                        var = true;

                }

            } catch (InputMismatchException e) {
                System.out.println("\nOpcion Incorrecta, Ingresela de Nuevo");
                scanner.nextLine();
            }
        }

        scanner.close();

    }

}