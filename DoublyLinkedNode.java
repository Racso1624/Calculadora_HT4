/****************************************
 * Oscar Fernando López Barrios 20679
 * Jose Pablo Monzon 20309
 * Estructuras de Datos
 * 28-02-2021
 ****************************************/

 //Se crea la clase DoublyLinkedNode
public class DoublyLinkedNode<E> {

    //Se crean las propiedades
    protected E data;
    protected DoublyLinkedNode<E> nextElement;
    protected DoublyLinkedNode<E> previousElement;

    //Se crea el constructor
    public DoublyLinkedNode(E v, DoublyLinkedNode<E> next,DoublyLinkedNode<E> previous){

        data = v;
        nextElement = next;
        if (nextElement != null)
            nextElement.previousElement = this;
        previousElement = previous;
        if (previousElement != null)
            previousElement.nextElement = this;

    }

    public DoublyLinkedNode(E v){
        this(v,null,null);
    }

    
    /** 
     * @return DoublyLinkedNode<E> se regresa el siguiente elemento
     */
    public DoublyLinkedNode<E> next(){
    // post: returns reference to next value in list
       return nextElement;
    }

    
    /** 
     * @param next se ingresa el siguiente elemento
     */
    public void setNext(DoublyLinkedNode<E> next){
   // post: sets reference to new next value
      nextElement = next;
   }

   
   /** 
    * @return E se regresa el valor
    */
   public E value(){
   // post: returns value associated with this element
      return data;
   }

   
   /** 
    * @param value se ingresa el valor
    */
   public void setValue(E value){
   // post: sets value associated with this element
      data = value;
   }

    
    /** 
     * @return DoublyLinkedNode<E> se regresa el valor nulo
     */
    public DoublyLinkedNode<E> previous() {
        return null;
    }

    
    /** 
     * @return E se toma un valor nulo
     */
    public E get(){
        return null;
    }

}