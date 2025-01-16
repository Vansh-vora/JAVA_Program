// Write a Java Program to display all prime odd numbers from 50 to 100.
public class Q17 {
    public static void main(String[] args) {
        System.out.println("Odd number from 50 to 100 are:");
        for(int i=50;i<=100;i++) {
            if (i % 2 != 0)
            {
                System.out.print(" "+i);
            }
        }
    }
}
