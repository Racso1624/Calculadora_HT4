public class Calculadora {

    Factory factory = new Factory();

    //Se crea el metodo Constructor
    public Calculadora(){}

    public String Calculo(String expresion, int dato) {

        Stack<Integer> stack = factory.factoryStack(dato);

        //Se crea un ciclo para lo caracteres
        for(int i = 0; i < expresion.length(); i++){

            //Se obtiene el caracter de la posicion i
            char caracter = expresion.charAt(i);

            //Se convierte el digito a caracter
            if(Character.isDigit(caracter)){

                int numero = Character.getNumericValue(caracter);
                stack.push(numero);

            }

            // Se verifica si el caracter es una letra
            else if(Character.isLetter(caracter)){

                return "No se puede operar, ya que contiene una letra";

            }

            //Se verifica que sea un signo
            else{

                //Se crean los numeros
                int numerouno = stack.pop();
                int numerodos = stack.pop();

                //Se crea el Switch
                switch(caracter){

                    //Se crean los casos dependiendo del signo
                    case '+':
                        int suma = Singleton.operar(numerouno, numerodos, 1);
                        stack.push(suma);
                        break;
                    case '-':
                        int resta = Singleton.operar(numerouno, numerodos, 2);
                        stack.push(resta);
                        break;
                    case '*':
                        int multiplicacion = Singleton.operar(numerouno, numerodos, 3);
                        stack.push(multiplicacion);
                        break;
                    case '/':
                        int division = Singleton.operar(numerouno, numerodos, 4);
                        stack.push(division);
                        break;    
                    default:
                        return "No se puede operar, ha ingresado un signo invalido";
                

                }

            }

        }

        //Se convierte el resultado a String y se devuelve
        int resultado = stack.pop();
        String resultadofinal = Integer.toString(resultado);

        return resultadofinal;

    }

}
