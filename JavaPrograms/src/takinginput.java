import java.util.Scanner;

public class takinginput {
    public static void main(String[] args) {
        System.out.println("--------------Taking Input from the User:----------------");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter id:");
        int a=sc.nextInt();
        System.out.println("Enter mobile no:");
        long no=sc.nextLong();
        System.out.println("Enter Your Name:");
        String str=sc.next();
        System.out.println("---------------------------");
        System.out.println(a);
        System.out.println(no);
        System.out.println(str);
        System.out.println("Enter Your Add:");
        String str2=sc.nextLine();
        System.out.println(str2);

    }
}
