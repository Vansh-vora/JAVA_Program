import java.util.Scanner;

// Write a Java Program to Check Whether a Number is Palindrome or Not
public class Q14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check that it is palindrome or not:");
        int num=sc.nextInt();
        int res,rem;

        res=rem=0;

        for(int i=num;i!=0;i/=10){
            rem=i%10;
            res=(res*10)+rem;
        }
        if(num==res){
            System.out.println("Entered number is Palindrome");
        }
        else {
            System.out.println("Entered number is not Palindrome");
        }
        sc.close();
    }
}
