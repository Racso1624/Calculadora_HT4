public class DoublyLinkedStack<E> implements Stack<E> {

    private DoublyLinkedList<E> data;

    public DoublyLinkedStack(){
        data = new DoublyLinkedList<E>();
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
