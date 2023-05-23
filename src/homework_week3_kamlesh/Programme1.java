package homework_week3_kamlesh;
/**
 * Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */


import java.util.Scanner;

public class Programme1 {
    public static void main(String[] args) {

        Number();
    }
    public static void Number(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to test");
        int number = sc.nextInt();
        sc.close();
        //ternary operator to check number
        String result = number%2==0 ? "Even" : "Odd";
        System.out.println(number +" is "+ result);

    }

}
