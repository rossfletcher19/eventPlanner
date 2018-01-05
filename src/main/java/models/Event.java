package models;

public class Event {

    private String food;
    private String beverages;
    private String entertainment;
    private Integer guests;
    private String coupon;

    public Event(String food, String beverages, String entertainment, Integer guests) {
        this.food = food;
        this.beverages = beverages;
        this.entertainment = entertainment;
        this.guests = guests;
        this.coupon = "";
    }

    public String getFood() {
        return food;
    }

    public String getBeverages() {
        return beverages;
    }
}
