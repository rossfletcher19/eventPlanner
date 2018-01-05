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
                System.out.println("Welcome to HomeStyle Service. We know how busy life can get and planning for events can slip and slide to the last minute. \nWhether its last minute or planning for something here in the near future, HomeStyle Service can take care of your food, beverage, and entertainment needs. \n\nLet's get started with your order! \n\nCurrently we have 4 food services to choose from: \n\n[1] Appetizer Layout: Wings, Hummus/Veggies, Dips and Chips. $8/person \n[2] Hawaiian Style Teriyaki Chicken, Mac Salad and Rice $15/person \n[3] HomeStyle BBQ - Ribs, Brisket, Mac + Cheese, Green Salad. $18/person \n[4] 3 Course Mediterranean Dinner - TriGreen Salad, Grilled Chicken or Fish, Choice of Dessert. $22/person \n\nPlease enter the corresponding food service item # to select your food service.   ");
                String foodServiceChoice = bufferedReader.readLine();

                if (!(foodServiceChoice.equals("1") || foodServiceChoice.equals("2") || foodServiceChoice.equals("3") || foodServiceChoice.equals("4"))) {
                    System.out.println("Sorry, was there an input error? Please make sure to select one of our # options.");
                    break;
                }

                System.out.println("Great! We've food taken care of but everyone we undoubtedly need something to drink. \nWe have 5 drink services we provide: \n\n[1] Non Alcoholic Beverage Service $5/person \n[2] Beer Service $8/person \n[3] Full Bar Service $12/person \n[4] Beer and Non Alcoholic Beverage $12/person \n[5] Full Bar and Non Alcoholic Beverage $17/person  \n\n Please enter the corresponding beverage service item # to select your beverage service.");
                String bevChoice = bufferedReader.readLine();

                if (!(bevChoice.equals("1") || bevChoice.equals("2") || bevChoice.equals("3") || bevChoice.equals("4") || bevChoice.equals("5"))) {
                    System.out.println("Sorry, was there an input error? Please make sure to select one of our # options.");
                    break;
                }

                System.out.println("Alright, now that we have food and drinks covered, would you like us to provide any entertainment services? \nWe have 3 services we can provide: \n\n[1] Live DJ - $1000/total \n[2] Live Band - $2500/total \n[3] Comedy Show - $1500/total \n[4] None");
                String entChoice = bufferedReader.readLine();

                if (!(entChoice.equals("1") || entChoice.equals("2") || entChoice.equals("3") || entChoice.equals("4"))) {
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

                System.out.println("You can now calculate the entire cost of your order if you are happy with it, or you can choose to start over. \n1 for Calculate. \n2 for Start Over.");
                String calcOrStartOverStep = bufferedReader.readLine();




            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
