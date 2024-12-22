import java.util.Scanner;

//Write a program to take input of name,age and fav colour from user using scanner class and display the output in sentence format
public class cecQ3 {
    public static void main(String[] args) {
        int age;
        String name;
        String favcolour;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        name=sc.next();
        System.out.println("Enter your age:");
        age=sc.nextInt();
        System.out.println("Enter your favcolour:");
        favcolour=sc.next();
        System.out.println("The favcolour of"+name+"is"+favcolour+"and his age is"+age);

    }
}
