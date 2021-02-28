import java.util.ArrayList;

public class ArrayListStack<E> implements Stack<E>{
    
    ArrayList <E> arraylist = new ArrayList<E>();

    @Override
    public void push(E data) {

        arraylist.add(data);

    }

    @Override
    public boolean empty() {

        boolean cantidad = false;
        if (arraylist.size()==0){
            cantidad = true;
        }
        return cantidad;

    }

    @Override
    public int size() {

        return arraylist.size();

    }

    @Override
    public E pop() {

        E num = peek();
        arraylist.remove(arraylist.size()-1);
        return num;

    }

    @Override
    public E peek() {

        return arraylist.get(arraylist.size() - 1);

    }

}
