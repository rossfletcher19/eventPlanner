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

    public String getEntertainment() {
        return entertainment;
    }

    public Integer getGuests() {
        return guests;
    }

    public String getCoupon() {
        return coupon;
    }

    public int calcTotalCost() {
        Integer mealTotal = 0;
        Integer bevTotal = 0;
        Integer entTotal = 0;
        if (food.equals("1")) {
            mealTotal += (8 * guests);
        } else if (food.equals("2")) {
            mealTotal += (15 * guests);
        } else if (food.equals("3")) {
            mealTotal += (18 * guests);
        } else if (food.equals("4")){
            mealTotal += (22 * guests);
        } else {
            System.out.println("There has been an input error. Please enter a valid meal #.");
        }

        if (beverages.equals("1")) {
            bevTotal += (5 * guests);
        } else if (beverages.equals("2")) {
            bevTotal += (8 * guests);
        } else if (beverages.equals("3")) {
            bevTotal += (12 * guests);
        } else if (beverages.equals("4")) {
            bevTotal += (13 * guests);
        } else if (beverages.equals("5")) {
            bevTotal += (17 * guests);
        } else {
            System.out.println("There has been an input error. Please enter a valid beverage #.");
        }

        if (entertainment.equals("1")) {
            entTotal += 1000;
        } else if (entertainment.equals("2")) {
            entTotal += 2500;
        } else if (entertainment.equals("3")) {
            entTotal += 1500;
        } else if (entertainment.equals("none")) {
            entTotal += 0;
        } else {
            System.out.println("There has been an input error. Please enter a valid entertainment #.");
        }

        int total = mealTotal + bevTotal + entTotal;
        return total;
    }
}
