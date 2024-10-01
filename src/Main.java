import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Variable name & their value
        double num1, num2;

        System.out.println("Enter the numbers:");
        // input values
        num1 = sc.nextDouble();
        /*String strValue = Double.toString(num1);

        if (strValue.matches("[0-9]+")) {
            System.out.println("Valid Input");
        }
            else {
                System.out.println("Invalid Input");
            }*/
        /*
        Hi Prachi
         */


        System.out.println("Enter the operator (+,-,*,/,%):");
        char op = sc.next().charAt(0);


        System.out.println("Enter the numbers:");
        // input values
        num2 = sc.nextDouble();

        double o = 0;


        switch (op) {
            case '+':
                o = num1 + num2;
                break;

            case '-':
                o = num1 - num2;
                break;

            case '*':
                o = num1 * num2;
                break;

            case '/':
                if (num2 != 0) {
                    o = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            case '%':
                o = num1 % num2;
                break;

            // Default case if the operator is invalid
            default:
                System.out.println("Invalid operator");
                break;

        }

        System.out.println("The final result:");
        System.out.println();

        // print the final result
        System.out.println(num1 + " " + op + " " + num2
                + " = " + o);
    }
}