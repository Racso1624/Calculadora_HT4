/****************************************
 * Oscar Fernando López Barrios 20679
 * Jose Pablo Monzon 20309
 * Estructuras de Datos
 * 28-02-2021
 ****************************************/

//Se crea la clase DoublyLinkedStack
public class DoublyLinkedStack<E> implements Stack<E> {

    //Se crean las propiedades
    private DoublyLinkedList<E> data;

    //Se crea el constructor
    public DoublyLinkedStack(){
        data = new DoublyLinkedList<E>();
    }
    

    
    /** 
     * @param num se ingresa el dato
     */
    @Override
    public void push(E num) {
        data.add(num);
    }

    
    /** 
     * @return boolean se regresa si esta vacio
     */
    @Override
    public boolean empty() {
        return data.isEmpty();
    }

    
    /** 
     * @return int se regresa el tamaño 
     */
    @Override
    public int size() {
        return data.size();
    }

    
    /** 
     * @return E re regresa el dato
     */
    @Override
    public E pop() {
        return data.remove();
    }

    
    /** 
     * @return E se regresa el dato
     */
    @Override
    public E peek() {
        return data.get();
    }
    
}
