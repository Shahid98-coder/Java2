import java.util.Scanner;

public class Calculator
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = in.nextInt();
        System.out.println("Enter second number: ");
        int b = in.nextInt();
        System.out.println("Enter operator: ");
        char op = in.next().charAt(0);
        int r = 0;
        switch (op) {
            case '+':
            r = a + b;
            System.out.println(a + " + " + b + " = " + r);
            break;
            
            case '-':
            r = a - b;
            System.out.println(a + " - " + b + " = " + r);
            break;
            
            case '*':
            r = a * b;
            System.out.println(a + " * " + b + " = " + r);
            break;
            
            case '/':
            r = a / b;
            System.out.println(a + " / " + b + " = " + r);
            break;
            
            default:
            System.out.println("INVALID OPERATOR");
        }
    }
}