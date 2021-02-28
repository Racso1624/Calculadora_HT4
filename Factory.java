public class Factory {

    public Stack factoryStack(int dato){

        if(dato == 1){
            return new ArrayListStack<Integer>();
        }
        else if(dato == 2){
            return new VectorStack<Integer>();
        }
        else if(dato == 3){
            return new SinglyLinkedStack<Integer>();
        }
        else if(dato == 4){
            return new DoublyLinkedStack<Integer>();
        }

        return null;

    }
    
}
