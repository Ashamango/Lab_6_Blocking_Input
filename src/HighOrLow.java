import java.util.Random;
import java.util.Scanner;

public class HighOrLow { // class RectangleInfo
    public static void main(String[] args) { // main
        // declare variables

        Scanner in = new Scanner(System.in);
        Random generator = new Random();
        double answer = 0; // num answer = 0
        int val = generator.nextInt(10) + 1;
        boolean done = false; // boolean done = false

        do { // do
            System.out.print("I have picked a number 1-10! Please enter the number you think it is: "); // output "I have picked a number 1-10! Please enter the number you think it is: "
            if (in.hasNextDouble() && (answer>=1 | answer<=10)) { // if returns true if nextDouble will succeed && if answer>=1 | answer<=10 then
                // Process
                answer = in.nextDouble(); // input answer
                in.nextLine(); // clear buffer
                done = true; // done = true
            } else { // else
                System.out.println("This is an invalid input. Please input a number!"); // output "This is an invalid input. Please input a number!"
                in.nextLine(); // clear buffer
            }

        } while (!done); // while done is false
        if (answer > val) { // if answer > val
            System.out.print("The number was " + val + ". You are higher!"); // output "The number was " + val + ". You are higher!"
        } else if (answer < val) { // else if answer < val
            System.out.print("The number was " + val + ". You are lower!"); // output "The number was " + val + ". You are lower!"
        } else { // else
            System.out.print("The number was " + val + ". You are on the money!"); // output "The number was " + val + ". You are on the money!"
        } // return
    } // end class
}