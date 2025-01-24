import java.util.*;
//Write a Java Program to create add function to sum all the elements.
//Note: use Variable length argument concept
public class Q10 {
    public static int add(int... numbers){
        int sum=0;

        for(int num : numbers){
            sum+=num;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("\nSum of 5,10,15:"+add(5,10,15));
        System.out.println("\nSum of 1,2,3,4,5:"+add(1,2,3,4,5));
        System.out.println("\nSum of 100,200,300:"+add(100,200,300));
        System.out.println("\nSum of no element :"+add());
    }
}
