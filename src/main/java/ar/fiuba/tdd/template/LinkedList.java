package ar.fiuba.tdd.template;


public class LinkedList<T> {

    private Node<T> head;


    public LinkedList(){
        head = new NullNode();
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public void removeLast(){
        head.removeLast();
    }

    public T getLast() throws AssertionError{
        return (T) head.getLastData();
    }


    public void addFirst(T data){
        (head = new NodeImplementation<T>(head)).setData(data);
    }

    public int size(){
        return head.amountOfNodesFromThis();
    }



}
