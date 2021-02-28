public class SinglyLinkedStack<E> implements Stack<E> {

    private SinglyLinkedList<E> data;

    public SinglyLinkedStack(){
        data = new SinglyLinkedList<E>();
    }
    

    @Override
    public void push(E num) {
        data.add(num);
    }

    @Override
    public boolean empty() {
        return data.isEmpty();
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public E pop() {
        return data.remove();
    }

    @Override
    public E peek() {
        return data.get();
    }
    
}
