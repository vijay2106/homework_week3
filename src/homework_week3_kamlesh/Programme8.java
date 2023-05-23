package homework_week3_kamlesh;
/**
 *Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */


import java.util.Scanner;

public class Programme8 {
    public static void main(String[] args) {
        Programme8 cityNameProg8 = new Programme8();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Any Alphabet");
        String alphabetname = scan.nextLine();
        cityNameProg8.printCityName(alphabetname);
    }

    private void printCityName(String alphabetname) {
        if (alphabetname.equals("A")) {
            System.out.println("Ahemdabad");
        } else if (alphabetname.equals("B")) {
            System.out.println("Bombay");
        } else if (alphabetname.equals("C")) {
            System.out.println("chicago");
        } else if (alphabetname.equals("D")) {
            System.out.println("Delhi");
        } else if (alphabetname.equals("E")) {
            System.out.println("Ellora");
        } else if (alphabetname.equals("F")) {
            System.out.println("Faizabad");
        } else {
            System.out.println("alphabet should be invalid entry:");
        }

    }

}
