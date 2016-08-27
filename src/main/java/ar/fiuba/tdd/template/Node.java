package ar.fiuba.tdd.template;


public interface Node {

    public void setNext(Node next);

    public void setData(Object data);

    public Node getNext();

    public Object getData();

    public int amountOfNodesFromThis();

    public Object getLast();

    public Node searchLast(Node node);
    public void addLast();
}
