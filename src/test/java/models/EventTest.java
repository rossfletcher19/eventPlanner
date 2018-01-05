package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class EventTest {
    @Test
    public void Event_instantiatesCorrect() throws Exception {
        Event testEvent = new Event("Main Course", "Alcohol", "DJ", 40);
        assertEquals(true, testEvent instanceof Event);
    }

    @Test
    public void getFood_fetchesFoodSelection_food() throws Exception {
        Event testEvent = new Event("Main Course", "Alcohol", "DJ", 40);
        assertEquals("Main Course", testEvent.getFood());
    }

    @Test
    public void getBeverages_fetchesBeverageSelection_beverage() throws Exception {
        Event testEvent = new Event("Main Course", "Alcohol", "DJ", 40);
        assertEquals("Alcohol", testEvent.getBeverages());
    }

}