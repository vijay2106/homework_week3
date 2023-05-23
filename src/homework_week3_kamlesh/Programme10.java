package homework_week3_kamlesh;
/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */

import java.util.Scanner;

public class Programme10 {

    public static void main(String[] args) {
        twonumber();
    }
    public static void twonumber(){
        Scanner sc = new Scanner(System.in);

        // taking input from the user using the Scanner
        // class
        System.out.print(
                "Enter the first and the Second number - ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        // selecting the operand for the calculations
        System.out.print(
                "Choose and Enter the type of operation you want to perform (+, -, *, /, %) - ");
        char op = sc.next().charAt(0);
        solve(a, b, op);
    }
    public static int solve(int a, int b, char op)
    {
        int ans = 0;
        // addition
        if (op == '+') {
            ans = a + b;
            // subtraction
        }
        else if (op == '-') {
            ans = a - b;
            // multiplication
        }
        else if (op == '*') {
            ans = a * b;
            // modulo
        }
        else if (op == '%') {
            ans = a % b;
            // division
        }
        else if (op == '/') {
            ans = a / b;
        }

        // printing the final result
        System.out.println("Your answer is - " + ans);
        return ans;
    }
}


