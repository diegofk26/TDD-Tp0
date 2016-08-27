package ar.fiuba.tdd.template;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class LinkedListTest {

    @Test
    public void theSizeOfAnEmptyLinkedListMustBeZero(){
        LinkedList list = new LinkedList();
        assertEquals(list.size(),0);
    }

    @Test
    public void isEmptyOfAnEmptyLinkedListMustBeTrue(){
        LinkedList list = new LinkedList();
        assertTrue(list.isEmpty());
    }


    @Test
    public void theSizeOfALinkedListThatContainsOneElementMustBeOne(){
        LinkedList list = new LinkedList();
        list.addFirst(new String("alsdkfj"));
        assertEquals(list.size(),1);
    }

    @Test
    public void gettingTheLastElementMustBeTheFirstElementThatWeAddIfWeOnlyUseAddFirst(){
        LinkedList list = new LinkedList<String>();
        list.addFirst(new String("Hola"));
        list.addFirst(new String("Como"));
        list.addFirst(new String("Va"));
        assertTrue(list.getLast().equals("Hola"));
    }
    @Test
    public void removingTheLastElementAndThenGettingTheLastElementOfTheList(){
        LinkedList list = new LinkedList<String>();
        list.addFirst(new String("Hola"));
        list.addFirst(new String("Como"));
        list.addFirst(new String("Va"));
        list.removeLast();
        assertTrue(list.getLast().equals("Como"));
    }


    public void removingTheOnlyElementOfALinkedListAndAskingIfItsEmptyMustReturnTrue(){
        LinkedList list = new LinkedList<String>();
        list.addFirst(new String("Hola"));
        list.removeLast();
        assertTrue(list.isEmpty());
    }
}
