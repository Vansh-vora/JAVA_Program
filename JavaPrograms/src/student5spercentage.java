import java.util.Scanner;

public class student5spercentage {
    public static void main(String[] args) {
        System.out.println("-------Calculate the Percentage of 5 Subject---------");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of Subject 1 (out of 100):");
        int sub1=sc.nextInt();
        System.out.println("Enter marks of Subject 2 (out of 100):");
        int sub2=sc.nextInt();
        System.out.println("Enter marks of Subject 3 (out of 100):");
        int sub3=sc.nextInt();
        System.out.println("Enter marks of Subject 4 (out of 100):");
        int sub4=sc.nextInt();
        System.out.println("Enter marks of Subject 5 (out of 100):");
        int sub5=sc.nextInt();
        System.out.println("-----------Total Marks is (out of 500):--------");
        float total=sub1+sub2+sub3+sub4+sub5;
        System.out.println(total);
        System.out.println("------Percentage from 5 Subjects are------------");
        float perc=((total/500)*100);
        System.out.println(perc);

    }
}
