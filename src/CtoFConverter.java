import java.util.Scanner;
public class CtoFConverter { // class CToFFConverter
    public static void main(String[] args) { // main
        Scanner in = new Scanner(System.in);

        // Declare variables
        double temperatureF = 0; // num temperatureF = 0
        double temperatureC = 0; // num temperatureC = 0
        boolean done = false; // boolean done = false

        // Prompt and input

        do { //do
            System.out.print("Please enter the temperature in C: ");// output "Please enter the temperature in C: "
            if(in.hasNextDouble()) { // if input returns true if nextDouble will succeed then
                {
                    // Process
                    temperatureC = in.nextDouble();//input temperatureC
                    temperatureF = (temperatureC * 9 / 5) + 32; // temperatureF = ( temperatureC - 32 ) * 5/9

                    if (temperatureF == 32) { // if temperatureF == 32 then
                        System.out.println("C to F is " + temperatureF + " degrees Fahrenheit and is the melting point."); // output "C to F is " + temperatureF + "degrees Fahrenheit and is the melting point."
                    }
                    else if (temperatureF == 212) { // else if temperatureF == 212 then
                        System.out.print("C to F is " + temperatureF + " degrees Fahrenheit and is the boiling point."); // output "C to F is " + temperatureF + "degrees Fahrenheit and is the boiling point."
                    }
                    else { //else
                        System.out.print("C to F is " + temperatureF + " degrees Fahrenheit"); // output "C to F is " + temperatureF + " degrees Fahrenheit"
                    }
                    in.nextLine(); // clears buffer
                    done = true; // done = true
                }
            }
            else { // else
                System.out.println("This is invalid. Please try again."); // output "This is invalid. Try again."
                in.nextLine();
            }
        } while(!done); // while done is false
     } // return
} //end class