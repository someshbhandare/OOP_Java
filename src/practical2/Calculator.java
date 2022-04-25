package practical2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Select Operation +, -, * or /");
            char operator = sc.next().charAt(0);

            System.out.println("Enter two no: ");
            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();

            double result = 0;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Invalid input");
            }
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);

            System.out.println("Do you want to continue(y/n):");
            char ch = sc.next().charAt(0);
            if(ch == 'n'){
                break;
            }
        }
    }
}
