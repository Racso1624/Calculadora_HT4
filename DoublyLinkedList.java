public class DoublyLinkedList<E> extends AbstractList<E>
{
   
   protected int count;
   protected DoublyLinkedNode<E> head;
   protected DoublyLinkedNode<E> tail;

   public DoublyLinkedList(){
   // post: constructs an empty list
      head = null;
      tail = null;
      count = 0;
   }

   @Override
   public int size() {
       return count;
   }

   @Override
   public void add(E data) {

       // construct a new element, making it head
       head = new DoublyLinkedNode<E>(data, head, null);
       // fix tail, if necessary
       if (tail == null) tail = head;
       count++;

   }

   @Override
   public E remove() {

       DoublyLinkedNode<E> temp = head;
       head = head.next(); // move head down list
       count--;
       return temp.value();

   }

   @Override
   public E get() {

       return head.get();

   }
}