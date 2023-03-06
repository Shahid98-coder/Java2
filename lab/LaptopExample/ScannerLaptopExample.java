package MY;

import java.util.Scanner;

public class ScannerLaptopExample {
    
    static int input;		// Declare a static variable input to store the user input option

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);	// Create a new Scanner object to read user input from the console
        
        
        do {		// Display the menu of options to the user and read the input until the user chooses to quit
            System.out.println("Choose an Option: \nAdd :- 1"
            		+ "\nSubtract :- 2"
            		+ "\nMultiply :- 3"
            		+ "\nEven & Odd Number :- 4"
            		+ "\nQuit :- 5");
            input = sc.nextInt();
            switch (input) {
                case 1:
                    // If the user chooses option 1, User enter two numbers and perform addition operation
                	System.out.println("-------------------------------");
                	System.out.println("Enter Two Numbers To Be Added: ");
                    double num1 = sc.nextDouble();
                    double num2 = sc.nextDouble();
                    System.out.println("The result is " + (num1 + num2));
                    System.out.println("-------------------------------");
                    break;
                case 2:
                    // If the user chooses option 2,  User enter two numbers and perform subtraction operation
                	System.out.println("-------------------------------");
                	System.out.println("Enter Two Numbers To Be Subtracted: ");
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    System.out.println("The result is " + (num1 - num2));
                    System.out.println("-------------------------------");
                    break;
                case 3:
                    // If the user chooses option 3, User enter two numbers and perform multiplication operation
                	System.out.println("-------------------------------");
                	System.out.println("Enter Two Numbers To Be Multiplied: ");
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    System.out.println("The result is " + (num1 * num2));
                    System.out.println("-------------------------------");
                    break;
                case 4:
                    // If the user chooses option 4, User to enter a number and Program find  even or odd number
                	System.out.println("-------------------------------");
                	System.out.println("Enter a number: \n");
                    num1 = sc.nextDouble();
                    if (num1 % 2 == 0) {
                        System.out.println("The Result is Even Number.");
                    } else {
                        System.out.println("The Result is Odd Number.");
                    }
                    break;
                case 5:
                    // If the user chooses option 5, quit the program or exit()
                    System.out.println("Thank You !!! \n Have A Good-Day Mam ");
                    break;
                default:
                    // If the user enters an invalid option, throw an exception with an error message
                    throw new IllegalArgumentException("Unexpected value: " + input);
            }
        } 
        while (input != 5); // Continue looping until the user chooses to quit
    }
}