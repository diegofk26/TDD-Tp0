package ar.fiuba.tdd.template;


public class LinkedList<T> implements List<T>{

    private Node<T> head;

    public LinkedList(){
        head = new HeadNode<T>();
    }

    public boolean isEmpty(){
        return size() == 0;
    }


    public void append(T data){
        head.append(new NodeImplementation<T>(data),head);
    }

    public int size(){
        return head.amountOfNodesFromThis();
    }

    public T getFirst() throws AssertionError{
        return head.getNext().getData();
    }

    public void removeFirst() throws AssertionError{
        head.setNext(head.getNext().getNext());
    }

}
