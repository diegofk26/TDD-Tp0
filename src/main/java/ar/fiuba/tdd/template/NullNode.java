package ar.fiuba.tdd.template;


public class NullNode implements Node{

    public void setNext(Node next){
        next.setNext(this);
    }

    public void setData( Object data){

    }

    public Node getNext(){
        return this;
    }

    public Object getData(){
        return null;
    }

    @Override
    public void removeLast() throws AssertionError {
        throw new AssertionError();
    }

    public int amountOfNodesFromThis(){
        return 0;
    }

    public Object getLastData() throws AssertionError{
        throw new AssertionError();
    }

    public Node searchLast(Node node){
        return node;
    }

    public void iterateToRemoveLastNode(Node first,Node middle) {
        middle.deleteYourselfIfYouAreTheLastNode(first,this);
    }

    @Override
    public void deleteYourselfIfYouAreTheLastNode(Node first, Node nullNode) {
        first = nullNode;
    }
}
