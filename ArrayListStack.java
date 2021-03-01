/****************************************
 * Oscar Fernando López Barrios 20679
 * Jose Pablo Monzon 20309
 * Estructuras de Datos
 * 28-02-2021
 ****************************************/

import java.util.ArrayList;

//Se crea la clase ArrayListStack
public class ArrayListStack<E> implements Stack<E>{
    
    //Se crean las propiedades
    ArrayList <E> arraylist = new ArrayList<E>();

    
    /** 
     * @param data se ingresa el dato
     */
    @Override
    public void push(E data) {

        arraylist.add(data);

    }

    
    /** 
     * @return boolean se regresa si esta vacio
     */
    @Override
    public boolean empty() {

        boolean cantidad = false;
        if (arraylist.size()==0){
            cantidad = true;
        }
        return cantidad;

    }

    
    /** 
     * @return int se regresa el tamaño
     */
    @Override
    public int size() {

        return arraylist.size();

    }

    
    /** 
     * @return E se regresa el dato del final
     */
    @Override
    public E pop() {

        E num = peek();
        arraylist.remove(arraylist.size()-1);
        return num;

    }

    
    /** 
     * @return E se regresa el ultimo dato
     */
    @Override
    public E peek() {

        return arraylist.get(arraylist.size() - 1);

    }

}
