package ar.fiuba.tdd.template;


public class NodeImplementation implements Node {

    private Node next = null;
    private Object data;

    public NodeImplementation(){
        this.next = new NullNode();
    }

    public NodeImplementation( Node next){
        this.next = next;
    }

    public void setData(Object data){
        this.data = data;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public Node getNext(){
        return this.next;
    }

    public Object getData(){
        return this.data;
    }

    public int amountOfNodesFromThis(){
        return 1 + next.amountOfNodesFromThis();
    }

    public Object getLastData(){
        return (this.searchLast(this)).getData();
    }

    public Node searchLast(Node node){
        return node.getNext().searchLast(this);
    }

    public void removeLast(){
        (this.getNext()).getNext().iterateToRemoveLastNode(this,this.getNext());
    }

    public void iterateToRemoveLastNode(Node first, Node middle){
        this.getNext().iterateToRemoveLastNode(middle,this);
    }

    public void deleteYourselfIfYouAreTheLastNode(Node first,Node nullNode) {
        first.setNext(nullNode);
    }
}
