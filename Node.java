/****************************************
 * Oscar Fernando López Barrios 20679
 * Jose Pablo Monzon 20309
 * Estructuras de Datos
 * 28-02-2021
 ****************************************/

 //Se crean la clase Node
public class Node<E>
{
   protected E data; // value stored in this element
   protected Node<E> nextElement; // ref to next

   public Node(E v, Node<E> next)
   // pre: v is a value, next is a reference to 
   //      remainder of list
   // post: an element is constructed as the new 
   //      head of list
   {
       data = v;
       nextElement = next;
   }

   public Node(E v)
   // post: constructs a new tail of a list with value v
   {
      this(v,null);
   }

   
   /** 
    * @return Node<E> se regreso el siguiente elemento
    */
   public Node<E> next()
   // post: returns reference to next value in list
   {
      return nextElement;
   }

   
   /** 
    * @param next ingresa el siguiente
    */
   public void setNext(Node<E> next)
   // post: sets reference to new next value
   {
      nextElement = next;
   }

   
   /** 
    * @return E se regresa el dato
    */
   public E value()
   // post: returns value associated with this element
   {
      return data;
   }

   
   /** 
    * @param value se ingresa el valor
    */
   public void setValue(E value)
   // post: sets value associated with this element
   {
      data = value;
   }
}