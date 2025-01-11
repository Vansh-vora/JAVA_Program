//Write a Java program that will convert the given temperature in fahrenheit to
//celcius using the formula C=(F-32)/1.8

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter temp in Fahrenheit:");
        double fahrenheit=sc.nextDouble();

        double cencius=(fahrenheit-32)/1.8;
        System.out.println("Temp in Cencius is:"+cencius);
    }
}
