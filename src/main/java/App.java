import models.*;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class App {

    public static void main(String[] args) {

        Integer eventTotalCost = 0;
        boolean runProgram = true;

        while (runProgram) {

            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Welcome to HomeStyle Service. We know how busy life can get and planning for events can slip and slide to the last minute. \nWhether its last minute or planning for something here in the near future, HomeStyle Service can take care of your food, beverage, and entertainment needs. \n\nLet's get started with your order! \nCurrently we have 4 food services to choose from: \n\nPick One: \n\n[Apps] Appetizer Layout: Wings, Hummus/Veggies, Dips and Chips. $8/person \n[Hawaiian Style] Hawaiian Style Teriyaki Chicken, Mac Salad and Rice $15/person \n[HomeStyle BBQ] HomeStyle BBQ - Ribs, Brisket, Mac + Cheese, Green Salad. $18/person \n[Mediterranean Dinner] 3 Course Mediterranean Dinner - TriGreen Salad, Grilled Chicken or Fish, Choice of Dessert. $22/person \n\nPlease enter the corresponding food service item name in brackets to select your food service.   ");
                String foodServiceChoice = bufferedReader.readLine();


                if (!(foodServiceChoice.equals("Apps") || foodServiceChoice.equals("Hawaiian Style") || foodServiceChoice.equals("HomeStyle BBQ") || foodServiceChoice.equals("Mediterranean Dinner"))) {
                    System.out.println("Sorry, was there an input error? Please make sure to select one of our # options.");
                    break;
                }

                System.out.println("Great! We've food taken care of but everyone we undoubtedly need something to drink. \nWe have 5 drink services we provide: \n\n[Non Alcoholic Beverage] $5/person \n[Beer Service] $8/person \n[Full Bar] $12/person \n[Beer and Non Alcoholic] $12/person \n[Full Bar and Non Alcoholic] $17/person  \n\n Please enter the corresponding beverage service item name in brackets to select your beverage service.");
                String bevChoice = bufferedReader.readLine();

                if (!(bevChoice.equals("Non Alcoholic Beverage") || bevChoice.equals("Beer Service") || bevChoice.equals("Full Bar") || bevChoice.equals("Beer and Non Alcoholic") || bevChoice.equals("Full Bar and Non Alcoholic"))) {
                    System.out.println("Sorry, was there an input error? Please make sure to select one of our # options.");
                    break;
                }

                System.out.println("Alright, now that we have food and drinks covered, would you like us to provide any entertainment services? \nWe have 3 services we can provide: \n\n[Live DJ] - $1000/total \n[Live Band] - $2500/total \n[Comedy Show] - $1500/total \n[None]");
                String entChoice = bufferedReader.readLine();

                if (!(entChoice.equals("Live DJ") || entChoice.equals("Live Band") || entChoice.equals("Comedy Show") || entChoice.equals("None"))) {
                    System.out.println("Sorry, was there an input error? Please make sure to select one of our # options.");
                    break;
                }

                System.out.println("Now how many guests do you think will be attending?");
                String NumOfGuests = bufferedReader.readLine();
                Integer intNumOfGuests = Integer.parseInt(NumOfGuests);

                Event newEvent = new Event(foodServiceChoice, bevChoice, entChoice, intNumOfGuests);

                String orderFood = newEvent.getFood();
                String orderBev = newEvent.getBeverages();
                String orderEnt = newEvent.getEntertainment();
                Integer orderGuests = newEvent.getGuests();

                System.out.println(String.format("------------------------------ \nSo far your order is: \nFood: %s \nBeverage: %s \nEntertainment: %s \nFor %d guests. \n------------------------------", orderFood, orderBev, orderEnt, orderGuests));

                System.out.println("You can now calculate the entire cost of your order if you are happy with it, or you can choose to start over. \n[Calculate] or [Start Over]");
                String calcOrStartOverStep = bufferedReader.readLine();

                if (calcOrStartOverStep.equals("Calculate")) {
                    eventTotalCost = newEvent.calcTotalCost();
                } else {
                    System.out.println("Let's try again.");
                    break;
                }
                System.out.println(eventTotalCost);
//                System.out.println(String.format("The total cost of your order so far is $%d.", eventTotalCost));
//
//
//                System.out.println("We are running a few coupons currently: \n [1] Large groups \n ");




            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
