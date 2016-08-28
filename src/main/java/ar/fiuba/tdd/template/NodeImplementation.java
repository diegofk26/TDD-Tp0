package ar.fiuba.tdd.template;


public class NodeImplementation<T> implements Node<T> {

    private Node<T> next = new NullNode<T>();
    private T data;

    public NodeImplementation(T data){
        this.data = data;
    }

    public NodeImplementation( Node<T> next){
        this.next = next;
    }

    public void setData(T data){
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

    public T getLastData(){
        return searchLast(this).getData();
    }

    public Node<T> searchLast(Node<T> previousNode){
        return previousNode.getNext().searchLast(this);
    }

    public void removeLast(){
        (this.getNext()).getNext().iterateToRemoveLastNode(this,this.getNext());
    }

    public void iterateToRemoveLastNode(Node<T> prePrevious, Node<T> previous){
        this.getNext().iterateToRemoveLastNode(previous,this);
    }

    public void deleteYourselfIfYouAreTheLastNode(Node<T> previous,Node<T> nullNode) {
        previous.setNext(nullNode);
    }
}
