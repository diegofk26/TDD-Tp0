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
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("Word");
        assertEquals(list.size(),1);
    }

    @Test
    public void gettingTheLastElementMustBeTheFirstElementThatWeAddIfWeOnlyUseAddFirst(){
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("Hello");
        list.addFirst("How");
        list.addFirst("Are");
        assertTrue(list.getLast().equals("Hello"));
    }
    @Test
    public void removingTheLastElementAndThenGettingTheLastElementOfTheList(){
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("Some String");
        list.addFirst("Important");
        list.addFirst("Some String");
        list.removeLast();
        assertTrue(list.getLast().equals("Important"));
    }


    public void removingTheOnlyElementOfALinkedListAndAskingIfItsEmptyMustReturnTrue(){
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("Hello World");
        list.removeLast();
        assertTrue(list.isEmpty());
    }
}
