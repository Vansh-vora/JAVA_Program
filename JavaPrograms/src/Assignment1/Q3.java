import java.util.Scanner;

//Write a Java program to calculate gross salary and net salary of an employee.
// Gross salary = Hourly rate * total number of hours worked
// Net salary = gross salary - tax (7.5%)
//Take values from users using Scanner class.
public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter hourly rate:");
        double hourlyrate=sc.nextDouble();
        System.out.println("Enter total no of hours work:");
        double hourswork=sc.nextDouble();

        double grossSalary=hourlyrate*hourswork;
        double tax=grossSalary*0.075;
        double netSalary=grossSalary-tax;

        System.out.println("Gross Salary:"+grossSalary);
        System.out.println("Net Salary:"+netSalary);
    }
}
