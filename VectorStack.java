import java.util.Vector;

public class VectorStack<E> implements Stack<E> {

    Vector <E> vector = new Vector<E>();

    @Override
    public void push(E data) {

        vector.add(data);
        
    }

    @Override
    public boolean empty() {

        boolean cantidad = false;
        if (vector.size()==0){
            cantidad = true;
        }
        return cantidad;

    }

    @Override
    public int size() {
        return vector.size();
    }

    @Override
    public E pop() {

        E num = peek();
        vector.removeElementAt(vector.size()-1);
        return num;

    }

    @Override
    public E peek() {

        return vector.get(vector.size() -1 );

    }
    
}
