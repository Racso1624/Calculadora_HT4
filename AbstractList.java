public abstract class AbstractList<E> implements List<E> {
    
    public AbstractList(){}

    @Override
    public boolean isEmpty() {

        return size() == 0;
    
    }

}
