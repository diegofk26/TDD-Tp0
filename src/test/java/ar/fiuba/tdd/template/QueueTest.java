package ar.fiuba.tdd.template;


import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class QueueTest {

    protected Queue<String> queue = new Queue<String>();

    @Rule
    public final ExpectedException exception = ExpectedException.none();


    @Test
    public void theSizeOfAnEmptyQueueMustBeZero() {
        assertEquals(queue.size(), 0);
    }

    @Test
    public void whenICreateAQueueIsEmptyMustBeTrue() {
        assertTrue(queue.isEmpty());
    }

    @Test
    public void tryingToRemoveAnElementFromAnEmptyLQueueMustThrowAnAssertionError(){
        boolean thrown = false;
        try { queue.remove(); } catch (AssertionError e) { thrown = true; }
        assertTrue(thrown);
    }

    @Test
    public void tryingToGetAnElementsDataFromAnEmptyLQueueMustThrowAnAssertionError(){
        boolean thrown = false;
        try { queue.top(); } catch (AssertionError e) { thrown = true; }
        assertTrue(thrown);
    }

    @Test
    public void addingThreeElementsAndGettingTheTopDataMusReturnTheRightData(){
        queue.add("Hello");
        queue.add("World");
        assertEquals(queue.top(),"Hello");
    }

}
