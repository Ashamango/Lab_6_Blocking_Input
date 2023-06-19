import java.util.Scanner;
public class MetricConverter { // class MetricConverter
    public static void main(String[] args) { // main

        Scanner in = new Scanner(System.in);

        double meters = 0; // num meters = 0
        double width = 0; // num width = 0
        double miles = 0; // num miles = 0
        double feet = 0; // num feet = 0
        double inches = 0; // num inches = 0

        boolean done = false; // boolean done = false

        do { // do
            System.out.print("Please enter the measurement in meters: ");// output "Please enter the measurement in meters: "
            if (in.hasNextDouble()) { // if input returns true if nextDouble will succeed then
                // Process
                meters = in.nextDouble(); // input meters
                in.nextLine(); // clear buffer
                done = true; // done = true
            }
            else // else
            {
                System.out.println("This is an invalid input for the height. Please input a number."); // output "This is an invalid input for the height. Please input a number."
                in.nextLine(); // clear buffer
            }

            } while (!done); // while done is false
        miles = meters / 1609.344; // miles = meters / 1609.344
        feet = meters * 3.28084; // feet = meters * 3.28084
        inches = meters * 39.37; // inches = meters * 39.37
       System.out.print(meters + " meters to miles is " + miles + " miles, to feet is " + feet + " feet, and to inches is " + inches + " inches."); // output meters + " meters to miles is " + miles + " miles, to feet is " + feet + " feet, and to inches is " + inches + " inches."
    } // return
} // end class
