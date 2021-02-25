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


		boolean var = false;
        while(var == false){

            System.out.println("\n\nBienvenido a la Calculadora");
            System.out.println("Ingrese la clase de implementacion que desea ");
            System.out.println("1) ArrayList");
            System.out.println("2) Vector");
            System.out.println("3) Lista simplemente encadenada");
            System.out.println("4) Lista doblemente encadenada");
            System.out.println("5) Salir");

            try {
                
                int opcion = scanner.nextInt();
                switch (opcion) {
					case 1:
                        System.out.println(linea);
					case 2:
                        
					case 3:
                        
					case 4:
                        
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