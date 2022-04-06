package Dia03.Pair_Programming;

import java.util.Vector;

public class VectorStack<E> implements Pila<E>{

    Vector<E> vector;

    public VectorStack(){
        vector = new Vector<E>();
    }
    
    @Override
    public void push(E element) {
        vector.addElement(element);
        
    }

    @Override
    public E pop() {
        return vector.remove(vector.size()-1);
    }

    @Override
    public E peek() {
        return vector.lastElement();
    }

    @Override
    public boolean isEmpty() {
        return vector.isEmpty();
    }
}