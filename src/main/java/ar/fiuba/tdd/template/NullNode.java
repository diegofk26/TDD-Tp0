package ar.fiuba.tdd.template;


public class NullNode implements Node{

    public void setNext(Node next){
        next.setNext(this);
    }

    public void setData( Object data){};

    public Node getNext(){
        return this;
    }

    public Object getData(){
        return null;
    }


    public int amountOfNodesFromThis(){
        return 0;
    }

    public Object getLast(){
        return null;
    }

    public Node searchLast(Node node){
        return node;
    }

}
