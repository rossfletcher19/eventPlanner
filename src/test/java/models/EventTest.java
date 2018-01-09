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

    @Test
    public void getEntertainment_fetchesEntertainmentSelection_entertainment() throws Exception {
        Event testEvent = new Event("Main Course", "Alcohol", "DJ", 40);
        assertEquals("DJ", testEvent.getEntertainment());
    }

    @Test
    public void getGuests_fetchesGuestsInt_int() throws Exception {
        Event testEvent = new Event("Main Course", "Alcohol", "DJ", 40);
        assertEquals(Integer.valueOf(40), testEvent.getGuests());
    }

    @Test
    public void calcCost_generateEventCostForUser_totalCost() throws Exception {
        Event testEvent = new Event("Apps", "Full Bar", "Live DJ", 40);
        assertEquals(1800, testEvent.calcTotalCost());
    }

    @Test
    public void MealTotal_getMealTotal_mealTotal() throws Exception {
        Event testEvent = new Event("Apps", "","",1);
        assertEquals(8, testEvent.calcTotalCost());
    }

    @Test
    public void bevTotal_getBevTotal_bevTotal() throws Exception {
        Event testEvent = new Event("", "Full Bar and Non Alcoholic","",5);
        assertEquals(85, testEvent.calcTotalCost());
    }

    @Test
    public void entTotal_getEntTotal_entTotal() throws Exception {
        Event testEvent = new Event("", "","Comedy Show",1);
        assertEquals(1500, testEvent.calcTotalCost());
    }

}