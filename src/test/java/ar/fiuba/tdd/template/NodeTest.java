package ar.fiuba.tdd.template;


import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class NodeTest {


    @Test
    public void constructingASingleNodeWithoutNextNodesAndCallingAmountOfNodesFromThisMustReturnOne(){
        Node node = new NodeImplementation();
        assertEquals(node.amountOfNodesFromThis(),1);
    }

    @Test
    public void creatingSomeNodesStoringSomeDataAndAskingForTheDataInTheLastNodeMustCoincideWithTheOriginalData(){
        Node node = new NodeImplementation( new NodeImplementation());
        node.getNext().setData("Hola");
        assertEquals(node.getLastData(),"Hola");
    }

    @Test
    public void removingTheLastElementAndAskingForTheLastData(){
        Node node = new NodeImplementation( new NodeImplementation());
        node.setData("Algo");
        node.getNext().setData("Hola");
        node.removeLast();
        assertEquals(node.getLastData(),"Algo");
    }

}