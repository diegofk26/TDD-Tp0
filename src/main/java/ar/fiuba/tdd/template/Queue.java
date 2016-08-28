package ar.fiuba.tdd.template;

public class Queue<T> {

    List<T> listOfItems;

    public Queue(){
        listOfItems = new LinkedList<T>();
    }


    public boolean isEmpty(){
        return size() == 0;
    }


    public int size(){
        return listOfItems.size();
    }

    public void add(T item)
    {
        listOfItems.append(item);
    }

    public T top() throws AssertionError {

        return listOfItems.getFirst();
    }

    public void remove() throws AssertionError{
        listOfItems.removeFirst();
    }


}