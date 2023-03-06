Scenario: A kids laptop manufacturer needs to develop a laptop which will display a message first,
Enter Option:

Add-1

Subtract-2

Multiply-3

Even/OddNumber -4

Quit-5

The kid should be allowed to enter an option. If the kid enters 1, a message needs to be displayed,

“Enter two numbers to be added”.

The kid should be allowed to enter two numbers (In two separate lines).

Based on the numbers entered, the program should add and display the result as below

“The result is <result>”

After the result is displayed, the program should loop back and ask for the next menu entry. If the kid enters  5, the program should quit. (The program needs to be executed and do either one of the options  until the kid enters the option 5)

Problem Statement:

Create a class ScannerLaptopDemo.java with a main method which performs the required operations as specified above.

Algorithm:
1.    Display message as specified to print the various options 1 to 5.

2.    On user enters one of the option based on the input the appropriate arithmetic operation is done as mentioned below.

3.    Using switch statement, display the appropriate message.

a.    Example if option is 1 “Enter two numbers to be added”, get the two numbers using Scanner class and print the added result.

b.    If option is 2 “Enter two numbers to be subtracted”, get the two numbers using Scanner class and print the subtracted result.

c.     If option is 3 “Enter two numbers to be multiplied”, get the two numbers using Scanner class and print the multiplied result.

d.    If option is 4 “Enter numbers to check even or add”, get the number using Scanner class and print the result.

e.    If option is 5 terminate the program.

 

4.     Perform step 1 to 4 in a do-while loop (while option != 5).






---------------------------------------------------------------------------------------------
    
    
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
