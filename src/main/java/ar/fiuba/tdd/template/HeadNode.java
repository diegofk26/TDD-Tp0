package ar.fiuba.tdd.template;

class HeadNode<T> implements Node<T> {

    private Node<T> next = new NullNode<>();

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getNext() {
        return next;
    }

    public T getData() {
        return null;
    }

    public int amountOfNodesFromThis() {
        return next.amountOfNodesFromThis();
    }

    public void append(Node<T> newNode, Node<T> currentNode) {
        next.append(newNode, this);
    }


}
