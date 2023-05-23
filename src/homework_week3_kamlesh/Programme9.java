package homework_week3_kamlesh;
/**
 * Same as above program-8 using switch statement.
 */

import java.util.Scanner;

public class Programme9 {
    public static void main(String[] args) {
            Programme9 statmentPro9 = new Programme9();
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter Any Alphabet");
            String alphabetname = scan.nextLine();
            statmentPro9.printCityName(alphabetname);
        }

        private void printCityName(String alphabetname) {
            switch (alphabetname) {
                case "A":
                    System.out.println("Ahemdabad");
                    break;
                case "B":
                    System.out.println("Bombay");
                    break;
                case "C":
                    System.out.println("chicago");
                    break;
                case "D":
                    System.out.println("Delhi");
                    break;
                case "E":
                    System.out.println("Ellora");
                    break;
                case "F":
                    System.out.println("Faizabad");
                    break;
                default:
                    System.out.println("alphabet should be invalid entry:");
                    break;

            }


        }
    }


