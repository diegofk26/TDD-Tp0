package ar.fiuba.tdd.template;


public interface Node<T> {

    void setNext(Node<T> next);

    void setData(T data);

    Node<T> getNext();

    T getData();

    int amountOfNodesFromThis();

    void removeLast();

    T getLastData() throws AssertionError;

    Node<T> searchLast(Node<T> previousNode);

    void iterateToRemoveLastNode(Node<T> prePreviousNode, Node<T> previousNode);

    void deleteYourselfIfYouAreTheLastNode(Node<T> previousNode,Node<T> nullNode);
}
