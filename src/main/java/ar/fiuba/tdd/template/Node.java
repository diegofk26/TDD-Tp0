package ar.fiuba.tdd.template;


public interface Node {

    void setNext(Node next);

    void setData(Object data);

    Node getNext();

    Object getData();

    int amountOfNodesFromThis();

    void removeLast();

    Object getLastData() throws AssertionError;

    Node searchLast(Node node);

    void iterateToRemoveLastNode(Node first, Node middle);

    void deleteYourselfIfYouAreTheLastNode(Node first,Node nullNode);
}
