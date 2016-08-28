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
    public void whenICreateAQueueMethodIsEmptyMustReturnTrue() {
        assertTrue(queue.isEmpty());
    }

    @Test
    public void theSizeOfAQueueWithThreeElementsMustBeThree() {
        queue.add("Hello");
        queue.add("World");
        queue.add("!!!");
        assertEquals(queue.size(), 3);
    }

    @Test
    public void tryingToRemoveAnElementFromAnEmptyLQueueMustThrowAnAssertionError() {
        boolean thrown = false;
        try {
            queue.remove();
        } catch (AssertionError e) {
            thrown = true;
        }
        assertTrue(thrown);
    }

    @Test
    public void tryingToGetAnElementsDataFromAnEmptyLQueueMustThrowAnAssertionError() {
        boolean thrown = false;
        try {
            queue.top();
        } catch (AssertionError e) {
            thrown = true;
        }
        assertTrue(thrown);
    }

    @Test
    public void addingThreeElementsAndGettingTheTopDataMusReturnTheRightData() {
        queue.add("Hello");
        queue.add("World");
        queue.add("!!!");
        assertEquals(queue.top(), "Hello");
    }

    @Test
    public void addingThreeElementsAndRemovingThemMustMadeOurQueueToBeEmpty() {
        queue.add("Hello");
        queue.add("World");
        queue.add("!!!");
        queue.remove();
        queue.remove();
        queue.remove();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void addingTwoElementsRemovingOneAndAskingForTheTopElementMustReturnTheSecondElementAdded() {
        queue.add("Hello");
        queue.add("World");
        queue.remove();
        assertEquals(queue.top(), "World");
    }

}
