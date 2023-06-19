import java.util.Scanner;
public class FuelCosts { // class FuelCosts
    public static void main(String[] args) { // main

        Scanner in = new Scanner(System.in);
        // declare variables
        double gasTank = 0; // num gasTank = 0
        double fuelEfficiency = 0; // num fuelEfficiency = 0
        double gasPrice = 0; // num gasPrice = 0
        double totalCost = 0; // num totalCost = 0
        double distance = 0; // num distance = 0

        boolean done = false;   // boolean done = false
        boolean done1 = false; // boolean done1 = false
        boolean done2 = false; // boolean done2 = false

        do { // do
            System.out.print("Please enter the number of gallons of gas in the tank: ");// output "Please enter the number of gallons of gas in the tank: "
            if (in.hasNextDouble()) { // if  returns true if nextDouble will succeed then
                // Process
                gasTank = in.nextDouble(); //input gallons
                in.nextLine(); // clear buffer
                done = true; // done = true
            }
            else { // else
                System.out.println("This is an invalid input of gallons. Please input a correct number."); // output "This is an invalid input of gallons. Please input a correct number."
                in.nextLine(); // clear buffer
            }
        } while (!done); // while done is false

        do { // do
            System.out.print("Please enter the fuel efficiency in miles per gallon: ");// output " "Please enter the fuel efficiency in miles per gallon: "
            if (in.hasNextDouble()) { // if input returns true if nextDouble will succeed then
                // Process
                fuelEfficiency = in.nextDouble(); //input fuel
                in.nextLine(); // clear buffer
                done1 = true; // done1 = true
            }
            else { // else
                System.out.println("This is an invalid input for fuel efficiency. Please input a correct number."); // output "This is an invalid input for fuel efficiency. Please input a correct number."
                in.nextLine(); // clear buffer
            }
        } while (!done1); // while done1 is false

        do { // do
            System.out.print("Please enter the price of gas per gallon: ");// output ""Please enter the price of gas per gallon: "
            if (in.hasNextDouble()) { // if input returns true if nextDouble will succeed then
                // Process
                gasPrice = in.nextDouble(); //input price
                in.nextLine(); // clear buffer
                done2 = true; // done2 = true
            }
            else { // else
                System.out.println("This is an invalid input of gas. Please input a correct number."); // output "This is an invalid input of gas. Please input a correct number."
                in.nextLine(); // clear buffer
            }
        } while (!done2); // while done2 is false

        // Print the cost per 100 miles and how far the car can go with the gas in the tank.
        totalCost = ( 100 / fuelEfficiency) * gasPrice; // totalCost = (100 / fuelEfficiency) * gasPrice;
        distance = fuelEfficiency * gasTank; // distance = fuelEfficiency * gasTank
        System.out.print("The total cost per 100 miles is " + totalCost + " dollars and the car can go " + distance + " miles with the gas in the tank" ); // output "The total cost per 100 miles is " + totalCost + " dollars and the car can go " + distance + " miles with the gas in the tank"

    } // return
} // end class
