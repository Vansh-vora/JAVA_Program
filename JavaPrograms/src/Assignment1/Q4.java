import java.util.Scanner;

//Write a Java Program that will accept a number from the user and calculate
//its square and cube and display the same
public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int Number=sc.nextInt();

        int Square=Number*Number;
        int cube=Number*Number*Number;

        System.out.println("Square is:"+Square);
        System.out.println("Cube is:"+cube);
    }
}
