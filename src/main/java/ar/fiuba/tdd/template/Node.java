package ar.fiuba.tdd.template;


interface Node<T> {

    void setNext(Node<T> next);

    Node<T> getNext();

    T getData();

    int amountOfNodesFromThis();

    void append(Node<T> newNode, Node<T> previousNode);

}
