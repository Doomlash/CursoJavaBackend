package Dia03.Challenge;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class Stack<E> {
    LinkedList<E> list;
    int top;

    public Stack(int maxSize){
        list = new LinkedList<E>();
    }

    public void push(E element){
        list.addLast(element);
    }

    public E pop(){
        if(!list.isEmpty()){
            return list.removeLast();
        } else {
            throw new EmptyStackException();
        }
    }

    public E peek(){
        if(!list.isEmpty()){
            return list.getLast();
        } else {
            throw new EmptyStackException();
        }
        
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public int size(){
        return list.size();
    }

}
