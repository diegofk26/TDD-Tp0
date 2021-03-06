package ar.fiuba.tdd.template;


class NullNode<T> implements Node<T> {

    private static final String ERROR_NULL_NODE_SET_NEXT_MSG = "Error: NullNode.setNext(next) breaks the rules";
    private static final String ERROR_NULL_NODE_GET_NEXT_MSG = "Error: You cant get the next element of a NullNode";
    private static final String ERROR_NULL_NODE_GET_DATA_MSG = "Error: You cant get the data of a NullNode";

    public void setNext(Node<T> next) {
        throw new AssertionError(ERROR_NULL_NODE_SET_NEXT_MSG);
    }

    public Node<T> getNext() throws AssertionError {
        throw new AssertionError(ERROR_NULL_NODE_GET_NEXT_MSG);
    }

    public T getData() throws AssertionError {
        throw new AssertionError(ERROR_NULL_NODE_GET_DATA_MSG);
    }


    public int amountOfNodesFromThis() {
        return 0;
    }

    public void append(Node<T> newNode, Node<T> previousNode) {
        previousNode.setNext(newNode);
    }
}
