/****************************************
 * Oscar Fernando López Barrios 20679
 * Jose Pablo Monzon 20309
 * Estructuras de Datos
 * 28-02-2021
 ****************************************/

 //Se crea la clase AbstractList
public abstract class AbstractList<E> implements List<E> {
    
    //Se crea el constructor
    public AbstractList(){}

    
    /** 
     * @return boolean se regresa si esta vacio
     */
    @Override
    public boolean isEmpty() {

        return size() == 0;
    
    }

}
