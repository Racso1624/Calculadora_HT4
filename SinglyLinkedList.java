public class SinglyLinkedList<E> extends AbstractList<E> {

	protected int count; // list size
	protected Node<E> head; // ref. to first element

	public SinglyLinkedList()
   // post: generates an empty list
   {
      head = null;
      count = 0;
   }


   @Override
   public int size() {

       return count;

   }

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

   @Override
   public E remove() {

       Node<E> temp = head;
       head = head.next(); // move head down list
       count--;
       return temp.value();

    }

   @Override
   public E get() {

       return head.value();

    }
}