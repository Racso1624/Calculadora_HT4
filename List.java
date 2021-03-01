/****************************************
 * Oscar Fernando López Barrios 20679
 * Jose Pablo Monzon 20309
 * Estructuras de Datos
 * 28-02-2021
 ****************************************/

 //Se crea la interfaz List
public interface List <E> {

   /** 
     * @return int se regresa el tamaño
     */
   public int size();

   /** 
     * @return boolean si esta vacio
     */
   public boolean isEmpty();

   /** 
     * @param data se ingresa el dato
      */
   public void add(E data);

   /** 
     * @return E se regresa el dato
     */
   public E remove();

   /** 
     * @return E se regresa el dato
     */
   public E get();
 
}