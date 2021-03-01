/****************************************
 * Oscar Fernando López Barrios 20679
 * Jose Pablo Monzon 20309
 * Estructuras de Datos
 * 28-02-2021
 ****************************************/

import java.util.Vector;

//Se crea la clase VectorStack
public class VectorStack<E> implements Stack<E> {

    //Se crean las propiedades
    Vector <E> vector = new Vector<E>();

    
    /** 
     * @param data se ingresa el dato
     */
    @Override
    public void push(E data) {

        vector.add(data);
        
    }

    
    /** 
     * @return boolean se regresa si esta vacio
     */
    @Override
    public boolean empty() {

        boolean cantidad = false;
        if (vector.size()==0){
            cantidad = true;
        }
        return cantidad;

    }

    
    /** 
     * @return int se regresa si esta el valor
     */
    @Override
    public int size() {
        return vector.size();
    }

    
    /** 
     * @return E se regresa el valor
     */
    @Override
    public E pop() {

        E num = peek();
        vector.removeElementAt(vector.size()-1);
        return num;

    }

    
    /** 
     * @return E se regresa el valor
     */
    @Override
    public E peek() {

        return vector.get(vector.size() -1 );

    }
    
}
