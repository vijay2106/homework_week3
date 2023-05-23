package homework_week3_kamlesh;
/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
 *
 */

import java.util.Scanner;

public class Programme3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter roll number: ");
        int rollNo = scanner.nextInt();

        System.out.print("Enter Math marks: ");
        int mathMarks = scanner.nextInt();
        validateMarks(mathMarks);

        System.out.print("Enter Science marks: ");
        int scienceMarks = scanner.nextInt();
        validateMarks(scienceMarks);

        System.out.print("Enter English marks: ");
        int englishMarks = scanner.nextInt();
        validateMarks(englishMarks);

        int totalMarks = mathMarks + scienceMarks + englishMarks;
        double percentage = (totalMarks / 3.0);

        String result = (percentage >= 35) ? "Pass" : "Fail";
        String grade;
        if (percentage >= 80) {
            grade = "A+";
        } else if (percentage >= 60) {
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B";
        } else {
            grade = "C";
        }

        System.out.println("___________________________________________");
        System.out.println("|                                         |");
        System.out.println("|                Mark Sheet               |");
        System.out.println("|_________________________________________|");
        System.out.println("|  Name           :   " + name + "        |");
        System.out.println("|  Roll No        :   " + rollNo + "      |");
        System.out.println("|_________________________________________|");
        System.out.println("|  Subjects       :   Marks               |");
        System.out.println("|_________________________________________|");
        System.out.println("|  Math           :   " + mathMarks + "   |");
        System.out.println("|  Science        :   " + scienceMarks + "|");
        System.out.println("|  English        :   " + englishMarks + "|");
        System.out.println("|_________________________________________|");
        System.out.println("|  Total          :   " + totalMarks + "  |");
        System.out.println("|_________________________________________|");
        System.out.println("|  Percentage     :   " + percentage + "  |");
        System.out.println("|  Result         :   " + result + "      |");
        System.out.println("|  Grade          :   " + grade + "       |");
        System.out.println("|_________________________________________|");
    }

    public static void validateMarks(int marks) {
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
        }
    }


}
