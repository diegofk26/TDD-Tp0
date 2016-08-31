package ar.fiuba.tdd.template;

class LinkedListQueue<T> implements Queue<T> {

    private List<T> listOfItems;

    LinkedListQueue() {
        listOfItems = new LinkedList<>();
    }

    public boolean isEmpty() {
        return listOfItems.isEmpty();
    }

    public int size() {
        return listOfItems.size();
    }

    public void add(T item) {
        listOfItems.append(item);
    }

    public T top() throws AssertionError {

        return listOfItems.getFirst();
    }

    public void remove() throws AssertionError {
        listOfItems.removeFirst();
    }

}