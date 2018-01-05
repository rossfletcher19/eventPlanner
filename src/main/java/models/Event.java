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
        if (food.equals("Apps")) {
            mealTotal += (8 * guests);
        } else if (food.equals("Hawaiian Style")) {
            mealTotal += (15 * guests);
        } else if (food.equals("HomeStyle BBQ")) {
            mealTotal += (18 * guests);
        } else if (food.equals("Mediterranean Dinner")){
            mealTotal += (22 * guests);
        } else {
            System.out.println("There has been an input error. Please enter a valid meal #.");
        }

        if (beverages.equals("Non Alcoholic Beverage")) {
            bevTotal += (5 * guests);
        } else if (beverages.equals("Beer Service")) {
            bevTotal += (8 * guests);
        } else if (beverages.equals("Full Bar")) {
            bevTotal += (12 * guests);
        } else if (beverages.equals("Beer and Non Alcoholic")) {
            bevTotal += (13 * guests);
        } else if (beverages.equals("Full Bar and Non Alcoholic")) {
            bevTotal += (17 * guests);
        } else {
            System.out.println("There has been an input error. Please enter a valid beverage #.");
        }

        if (entertainment.equals("Live DJ")) {
            entTotal += 1000;
        } else if (entertainment.equals("Live Band")) {
            entTotal += 2500;
        } else if (entertainment.equals("Comedy Show")) {
            entTotal += 1500;
        } else if (entertainment.equals("None")) {
            entTotal += 0;
        } else {
            System.out.println("There has been an input error. Please enter a valid entertainment #.");
        }

        int total = mealTotal + bevTotal + entTotal;
        return total;
    }
}
