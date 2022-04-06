package Dia03.Pair_Programming;

public interface Pila<E> {
    public void push(E element); //Agrega un elemento al final
    public E pop(); // Devuelve el elemento que esta arriva en la pila y lo saca
    public E peek(); // Devuelve el elemento que esta arriba de la pila sin sacarlo
    public boolean isEmpty();
}
