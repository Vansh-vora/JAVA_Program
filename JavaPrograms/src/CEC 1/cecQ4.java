import java.util.Scanner;

//write a program to accept an integer using scanner class and switch case create a simple calculator
public class cecQ4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num1:");
        float num1=sc.nextFloat();
        System.out.println("enter num2:");
        float num2=sc.nextFloat();
        System.out.println("enter the operation:");
        String opr=sc.next();
        switch(opr){
            case "+":
                float add=num1+num2;
                System.out.println("The addition of"+num1+"and"+num2+"is"+add);
                break;
            case "-":
                float sub=num1-num2;
                System.out.println("The Subtraction of"+num1+"and"+num2+"is"+sub);
                break;
            case "*":
                float mul=num1*num2;
                System.out.println("The Multiplication of"+num1+"and"+num2+"is"+mul);
                break;
            case "/":
                float div=num1/num2;
                System.out.println("The Division of"+num1+"and"+num2+"is"+div);
            default:
                break;
        }



    }
}
