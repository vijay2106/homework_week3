package homework_week3_kamlesh;

/**

WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
        salary
        HRA = basic salary 10%
        DA = Basic salary 8%
        TA = Basic salary 9%
        PF= Basic salary 20%
        Gross salary = basic salary + HRA + TA + DA –PF
        Print in following format
        _______________________________
        | Salary Slip |
        |______________________________|
        | Employee Id : 2564 |
        | Employee Name : Jay |
        |______________________________|
        | Basic Salary : 25000.0 |
        | HRA 10% : 2500.0 |
        | TA 8% : 2250.0 |
        | DA 9% : 2000.0 |
        | PF - 20& : 5000.0 |
        |______________________________|
        | Gross Salary : 26750.0 |
        |===========================|
*/

import java.util.Scanner;

public class Programme5 {
    public static void main(String[] args) {
         Programme5 salarySlipPro5 = new Programme5();

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Employee Id");
        int empId = scan.nextInt();


        System.out.println("Enter Employee Name");
        String eName = scan.next();


        System.out.println("Enter Basic salary");
        int bSalary = scan.nextInt();


        salarySlipPro5.printSalarySlip(empId, eName, bSalary);
    }

    private void printSalarySlip(int empId, String eName, int bSalary) {
        System.out.println("_________________________________________");
        System.out.println("|         Salary Slip                    |");
        System.out.println("|________________________________________|");
        System.out.println("|Employee Id    :"+empId+"                      |");
        System.out.println("|Employee Name  :"+eName+"                    |");
        System.out.println("|________________________________________|");
        System.out.println("|Basic Salary   :"+bSalary+"                   |");

        double hra = (10 * bSalary)/100;
        System.out.println("|HRA 10%        :" +hra+"                  |");

        double ta = (9 * bSalary)/100;
        System.out.println("|TA 9%          :" +ta+"                   |");

        double da = (8 * bSalary)/100;
        System.out.println("|DA 8%          :" + da+"                  |");

        double pf = (20 * bSalary)/100;
        System.out.println("|PF - 20&       :" + pf+"                 |");

        double grossSalary = bSalary + hra + ta + da - pf;
        System.out.println("|________________________________________|");

        System.out.println("|Gross Salary :"+grossSalary+"                   |");
        System.out.println("|________________________________________|");

    }
}




