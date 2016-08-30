package ar.fiuba.tdd.template;


class LinkedList<T> implements List<T> {

    private Node<T> head;

    LinkedList() {
        head = new HeadNode<>();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void append(T data) {
        head.append(new NodeImplementation<>(data), head);
    }

    public int size() {
        return head.amountOfNodesFromThis();
    }

    public T getFirst() throws AssertionError {
        return head.getNext().getData();
    }

    public void removeFirst() throws AssertionError {
        head.setNext(head.getNext().getNext());
    }

}
