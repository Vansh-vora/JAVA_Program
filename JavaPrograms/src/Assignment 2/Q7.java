import java.util.*;
//Write a Java Program to create an array containing marks of all students in physics using
//a for-each loop.
public class Q7 {
    public static void main(String[] args) {
        int[] marks={ 87,92,78,65,89,73,94,88,81,77 };

        System.out.println("\n Marks of Student in Physics:");
        for(int e : marks){
            System.out.print(e+" ");
        }
    }
}
