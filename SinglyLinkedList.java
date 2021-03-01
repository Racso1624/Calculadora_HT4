/****************************************
 * Oscar Fernando López Barrios 20679
 * Jose Pablo Monzon 20309
 * Estructuras de Datos
 * 28-02-2021
 ****************************************/

 //Se crea la clase SinglyLinkedList
public class SinglyLinkedList<E> extends AbstractList<E> {

    //Se crean las propiedades
	protected int count; // list size
	protected Node<E> head; // ref. to first element

    //Se crea la constructor
	public SinglyLinkedList()
   // post: generates an empty list
   {
      head = null;
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
    * @param data se ingresa el dato
    */
   @Override
   public void add(E data) {
       // location for new value

      Node<E> temp = new Node<E>(data,null);
      if (head != null)
     {
         // pointer to possible tail
         Node<E> finger = head;
         while (finger.next() != null)
         {
                finger = finger.next();
         }

         finger.setNext(temp);
      } else head = temp;

	  count++;

   }

   
   /** 
    * @return E se regresa el dato
    */
   @Override
   public E remove() {

       Node<E> temp = head;
       head = head.next(); // move head down list
       count--;
       return temp.value();

    }

   
   /** 
    * @return E se regresa el dato
    */
   @Override
   public E get() {

       return head.value();

    }
}