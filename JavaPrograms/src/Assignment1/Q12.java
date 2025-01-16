import java.util.Scanner;

// Write a Java Program to Find the Largest Number Among three Numbers
// Entered by User using nested if-else and if-else ladder.
public class Q12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter second number:");
        int b=sc.nextInt();
        System.out.println("Enter third number:");
        int c=sc.nextInt();

        if(a>c)
        {
            if(a>b)
            {
                System.out.println("The Largest number is:"+a);
            }
            else {
                System.out.println("The Largest number is:"+b);
            }
        }
        else {
            System.out.println("The Largest number is:"+c);
        }

    }
}
