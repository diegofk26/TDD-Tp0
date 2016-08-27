package ar.fiuba.tdd.template;

public class Queue<T> {

    LinkedList listOfItems;

    public Queue(){
        listOfItems = new LinkedList();
    }


    boolean isEmpty(){
        return size() == 0;
    }


    int size(){
        return listOfItems.size();

    }

    void add(T item) // agregar un item
    {
        listOfItems.addFirst(item);
    }

    T top() throws AssertionError {
        return (T) listOfItems.getLast();

    }

    void remove() throws AssertionError{
        listOfItems.removeLast();
    }

}