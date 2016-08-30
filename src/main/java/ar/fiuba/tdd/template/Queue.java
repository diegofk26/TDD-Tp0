package ar.fiuba.tdd.template;

class Queue<T> {

    private List<T> listOfItems;

    Queue() {
        listOfItems = new LinkedList<>();
    }

    boolean isEmpty() {
        return listOfItems.isEmpty();
    }

    int size() {
        return listOfItems.size();
    }

    void add(T item) {
        listOfItems.append(item);
    }

    T top() throws AssertionError {

        return listOfItems.getFirst();
    }

    void remove() throws AssertionError {
        listOfItems.removeFirst();
    }

}