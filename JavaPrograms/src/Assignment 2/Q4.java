import java.util.*;
//Write a Java program to create an array with 10 elements and sort it.
public class Q4 {
    public static void main(String[] args){
        int[] arr = { 10,30,20,6,90,76,32,45,44,36 };
        System.out.println("The normal array is:"+ Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println("\n Sorted Array is:"+Arrays.toString(arr));
    }
}
