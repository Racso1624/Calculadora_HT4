/****************************************
 * Oscar Fernando López Barrios 20679
 * Jose Pablo Monzon 20309
 * Estructuras de Datos
 * 28-02-2021
 ****************************************/

 //Se crea la clase DoublyLinkedList
public class DoublyLinkedList<E> extends AbstractList<E>
{
   
    //Se crean las propiedades
    protected int count;
    protected DoublyLinkedNode<E> head;
    protected DoublyLinkedNode<E> tail;

    //Se crea el constructor
    public DoublyLinkedList(){
    // post: constructs an empty list
        head = null;
        tail = null;
        count = 0;
    }

    
    /** 
     * @return int se regresa el tamaño
     */
    @Override
    public int size() {
        return count;
    }

    
    /** 
     * @param data dato para ingresar
     */
    @Override
    public void add(E data) {

        // construct a new element, making it head
        head = new DoublyLinkedNode<E>(data, head, null);
        // fix tail, if necessary
        if (tail == null) tail = head;
        count++;

    }

    
    /** 
     * @return E se regresa el dato
     */
    @Override
    public E remove() {

        DoublyLinkedNode<E> temp = head;
        head = head.next(); // move head down list
        count--;
        return temp.value();

    }

    
    /** 
     * @return E se regresa el dato
     */
    @Override
    public E get() {

        return head.get();

    }

}