/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

import java.util.LinkedList;

/**
 *
 * @author Red King
 */
public class GenericQueue<E> {
    private LinkedList<E> list = new LinkedList<E>();
    public void enqueue(E e){
        list.addLast(e);
    }
    public E dequeue(){
        return list.removeFirst();
    }
    public int getSize(){
        return list.size();
    }
    @Override
    public String toString(){
        return "Queue: " + list.toString();
    }
    public E getFront(){
        return list.getFirst();
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
}
