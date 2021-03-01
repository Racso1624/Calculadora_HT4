/****************************************
 * Oscar Fernando López Barrios 20679
 * Jose Pablo Monzon 20309
 * Estructuras de Datos
 * 28-02-2021
 ****************************************/

 //Se crea la clase Factory
public class Factory {

    
    /** 
     * @param dato se ingresa el numero del dato
     * @return Stack se regresa la instancia
     */
    //Se crea la clase Stack
    public Stack factoryStack(int dato){

        if(dato == 1){
            return new ArrayListStack<Integer>();
        }
        else if(dato == 2){
            return new VectorStack<Integer>();
        }
        else if(dato == 3){
            return new SinglyLinkedStack<Integer>();
        }
        else if(dato == 4){
            return new DoublyLinkedStack<Integer>();
        }

        return null;

    }
    
}
