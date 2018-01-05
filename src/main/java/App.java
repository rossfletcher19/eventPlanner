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

                System.out.println("Great! We've food taken care of but everyone we undoubtedly need something to drink. \nWe have 5 drink services we provide: \n\n[1] Non Alcoholic Beverage Service \n[2] Beer Service \n[3] Full Bar Service \n[4] Beer and Non Alcoholic Beverage \n[5] Full Bar and Non Alcoholic Beverage  \n\n Please enter the corresponding beverage service item # to select your beverage service.");
                String bevChoice = bufferedReader.readLine();

                if (!(bevChoice.equals("1") || bevChoice.equals("2") || bevChoice.equals("3") || bevChoice.equals("4") || bevChoice.equals("5"))) {
                    System.out.println("Sorry, was there an input error? Please make sure to select one of our # options.");
                    break;
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
