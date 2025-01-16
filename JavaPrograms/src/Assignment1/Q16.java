// Write a Java program to display all even numbers from 1 to 100 using forloop
public class Q16 {
    public static void main(String[] args) {
        System.out.println("Even numbers from 1 to 100 are:");
        for(int i=0;i<=100;i++)
        {
            if(i%2==0)
            {
                System.out.print(" "+i);
            }
        }

    }
}
