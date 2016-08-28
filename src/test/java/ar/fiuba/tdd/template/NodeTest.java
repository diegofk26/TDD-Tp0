package ar.fiuba.tdd.template;


import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class NodeTest {
    @Test
    public void constructingASingleNodeWithoutNextNodesAndCallingAmountOfNodesFromThisMustReturnOne(){
        Node<String> node = new NodeImplementation<String>("Hello");
        assertEquals(node.amountOfNodesFromThis(),1);
    }

    @Test
    public void creatingSomeNodesStoringSomeDataAndAskingForTheDataInTheLastNodeMustCoincideWithTheOriginalData(){
        Node<String> node = new NodeImplementation<String>( new NodeImplementation<String>("Hello"));

        assertEquals(node.getLastData(),"Hello");
    }

    @Test
    public void removingTheLastElementAndAskingForTheLastData(){
        Node<String> node = new NodeImplementation<String>( new NodeImplementation<String>("Not Important"));
        node.setData("Important");
        node.removeLast();
        assertEquals(node.getLastData(),"Important");
    }
}