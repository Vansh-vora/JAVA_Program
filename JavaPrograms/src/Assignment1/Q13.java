import java.util.Scanner;

// Write a program to display the grade according to the marks entered by the
// user using else-if ladder.
public class Q13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks:");
        int marks=sc.nextInt();

        String grade;

        if (marks>85){
            grade="A+";
        } else if (marks>70 && marks<85) {
            grade="A";
        } else if (marks>60 && marks<70) {
            grade="B";
        } else if (marks>50 && marks<60) {
            grade="C";
        } else if (marks>33 && marks<50) {
            grade="D";
        }else {
            grade="F";
        }
        System.out.println("Your marks is:"+marks);
        System.out.println("Your Grade is:"+grade);

    }
}
