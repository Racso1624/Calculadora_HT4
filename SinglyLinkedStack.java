/****************************************
 * Oscar Fernando López Barrios 20679
 * Jose Pablo Monzon 20309
 * Estructuras de Datos
 * 28-02-2021
 ****************************************/

 //Se crea la clase SinglyLinkedStack
public class SinglyLinkedStack<E> implements Stack<E> {

    //Se crean las propiedades
    private SinglyLinkedList<E> data;

    //Se crea el constructor
    public SinglyLinkedStack(){
        data = new SinglyLinkedList<E>();
    }
    

    
    /** 
     * @param num se ingresa el numero
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
     * @return E se regresa el dato
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
