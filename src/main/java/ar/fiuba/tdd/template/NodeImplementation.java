package ar.fiuba.tdd.template;


public class NodeImplementation implements Node {

    Node next = null;
    Object data;

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

    public Object getLast(){
        return (this.searchLast(this)).getData();
    }

    public Node searchLast(Node node){
        return node.getNext().searchLast(this);
    }

    public void addLast(){
            
    }



}
