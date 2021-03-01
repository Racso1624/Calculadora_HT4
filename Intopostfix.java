/****************************************
 * Oscar Fernando López Barrios 20679
 * Jose Pablo Monzon 20309
 * Estructuras de Datos
 * 28-02-2021
 ****************************************/

import java.util.Stack;

//Se crea la clase Intopostfix
public class Intopostfix {
    
    
    /** 
     * @param operacion se ingresa la operacion infix
     * @return String se regresa la operacion en postfix
     */
    //
    public static String infixToPostfix(String operacion){
        // Crear un string vacio
        String resultado = ""; 
              
        // Crear un stack vacio
        Stack<Character> data = new Stack<Character>();
          
        for (int i = 0; i < operacion.length(); i++){

            char character = operacion.charAt(i); 
              
            // Revisar si es un operando como un + - * /
            if (Character.isLetterOrDigit(character)) 
                resultado += character; 
               
            // Revisar si es un (
            else if (character == '(') 
                data.push(character); 
              
            // Revisar si es un ) 
            else if (character == ')') 
            { 
                while (!data.isEmpty() &&  
                        data.peek() != '(') 
                    resultado += data.pop(); 
                  
                    data.pop(); 
            } 
            else 
            { 
                while (!data.isEmpty() && precedence(character)<= precedence(data.peek())){ 
                    
                    resultado += data.pop(); 
                } 
                data.push(character); 
            }
        }

        while (!data.isEmpty()){ 
            if(data.peek() == '(') 
                return "Expresion no valida"; 
            resultado += data.pop(); 
         } 

        return resultado; 

    }

    
    /** 
     * @param character se ingresa el caracter
     * @return int se retorna el numero del caracter
     */
    public static int precedence(char character){ 
        switch (character) { 

        case '+': 
        case '-': 
            return 1; 
       
        case '*': 
        case '/': 
            return 2; 
       
        case '^': 
            return 3; 
        } 
        return -1; 
    } 
}
