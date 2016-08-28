package ar.fiuba.tdd.template;

public class HeadNode<T> implements Node<T>{

    private Node<T> next = new NullNode<T>();

    public void setNext(Node<T> next){
        this.next = next;
    }

    public Node<T> getNext(){
        return next;
    }

    public T getData(){
        return null;
    }

    public int amountOfNodesFromThis(){
        return 0 + next.amountOfNodesFromThis();
    }

    public void append(Node<T> newNode, Node<T> currentNode){
        next.append(newNode,this);
    }


}
