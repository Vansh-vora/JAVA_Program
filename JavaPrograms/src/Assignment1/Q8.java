import javax.swing.*;
import java.util.Scanner;

//Write a Java Program that will ask the user to input one number and check
//whether its prime number or not using Constructor
public class Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=0;
        number=Integer.parseInt(JOptionPane.showInputDialog("Enter the Number to check Prime or Not:"));
        Numb num=new Numb(number);

    }
}
class Numb{
    int number;

    Numb(int i){
        int count=0;
        for(int j=1;j<=i;j++)
        {
            if(i % j == 0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.println("The Number is Prime Number");
        }
        else{
            System.out.println("The Number is not a Prime NUmber");
        }
    }
}
