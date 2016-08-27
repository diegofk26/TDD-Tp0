package ar.fiuba.tdd.template;

import com.sun.org.apache.xerces.internal.dom.NodeImpl;

public class LinkedList<T> {

    private Node head;


    public LinkedList(){
        head = new NullNode();
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public void removeLast(){

    }

    public T getLast(){
        return (T) head.getLast();
    }

    public void addLast(T data){
        head.addLast();
    }

    public void addFirst(T data){
        (head = new NodeImplementation(head)).setData(data);
    }

    public int size(){
        return head.amountOfNodesFromThis();
    }



}
