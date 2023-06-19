import java.util.Scanner;
public class RectangleInfo { // class RectangleInfo
    public static void main(String[] args) { // main

        Scanner in = new Scanner(System.in);

        double height = 0; // num height = 0
        double width = 0; // num width = 0
        double area = 0; // num area = 0
        double perimeter = 0; // num perimeter = 0
        double diagonal = 0; // num diagonal = 0

        boolean done = false; // boolean done = false
        boolean done1 = false; // boolean done1 = false

        do { // do
            System.out.print("Please enter the height: ");// output "Please enter the height: "
            if (in.hasNextDouble()) { // if input returns true if nextDouble will succeed then
                // Process
                height = in.nextDouble(); // input height
                in.nextLine(); // clear buffer
                done = true; // done = true
            } else { // else
                System.out.println("This is an invalid input for the height. Please input a number."); // output "This is an invalid input for the height. Please input a number."
                in.nextLine(); // clear buffer
            }
        } while (!done); // while done is false

        do { // do
            System.out.print("Please enter the width: ");// output "Please enter the width: "
            if (in.hasNextDouble()) { // if input returns true if nextDouble will succeed then
                // Process
                width = in.nextDouble(); // input width
                done1 = true; // done1 = true
                in.nextLine(); // clear buffer
            } else { // else
                System.out.println("This is an invalid input for the width. Please input a number."); // output "This is an invalid input for the width. Please input a number."
                in.nextLine(); // clear buffer
            }
        } while (!done1); // while done1 is false

        area = height * width; // area = height * width
        perimeter = (height *2) + (width * 2); // perimeter = (height *2) + (width * 2)
        diagonal = (Math.pow(height,2)) + (Math.pow(width,2)); // diagonal = (Math.pow(height,2)) + (Math.pow(width,2))
        diagonal = (Math.sqrt(diagonal)); // diagonal = (Math.sqrt(diagonal))

        System.out.print("The area of the rectangle is " + area + " , the perimeter of the rectangle is " + perimeter + " , and the length of the diagonal is " + diagonal); // output "The area of the rectangle is " + area + " , the perimeter of the rectangle is " + perimeter + " , and the length of the diagonal is " + diagonal

    } // return
} // end class
