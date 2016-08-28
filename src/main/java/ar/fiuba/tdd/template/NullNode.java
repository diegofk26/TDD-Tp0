package ar.fiuba.tdd.template;


public class NullNode<T> implements Node<T>{

    public void setNext(Node<T> next){
    }

    public void setData( T data){}

    public Node<T> getNext(){
        return this;
    }

    public T getData(){
        return null;
    }

    public void removeLast() throws AssertionError {
        throw new AssertionError();
    }

    public int amountOfNodesFromThis(){
        return 0;
    }

    public T getLastData() throws AssertionError{
        throw new AssertionError();
    }

    public Node<T> searchLast(Node<T> previousNode){
        return previousNode;
    }

    public void iterateToRemoveLastNode(Node<T> prePrevious,Node<T> previous) {
        previous.deleteYourselfIfYouAreTheLastNode(prePrevious,this);
    }

    public void deleteYourselfIfYouAreTheLastNode(Node<T> previousNode, Node<T> nullNode) {
        previousNode = nullNode;
    }
}
