import java.util.Stack;

public class Intopostfix {
    
    public static String infixToPostfix(String operacion){
        // crear un string vacio
        String resultado = ""; 
              
        // crear un stack vacio
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
