package ar.fiuba.tdd.template;


public class NodeImplementation<T> implements Node<T> {

    private Node<T> next = new NullNode<T>();
    private T data;

    public NodeImplementation(T data){
        this.data = data;
    }

    public void setNext(Node<T> next){
        this.next = next;
    }

    public Node<T> getNext(){
        return this.next;
    }

    public T getData(){
        return this.data;
    }

    public int amountOfNodesFromThis(){
        return 1 + next.amountOfNodesFromThis();
    }

    public void append(Node<T> newNode, Node<T> previousNode){
        next.append(newNode,this);
    }

}
