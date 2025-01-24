import java.util.*;
//Create a stack with 5 elements and find the minimum value out of it
public class Q13 {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();

        stack.push(40);
        stack.push(30);
        stack.push(50);
        stack.push(20);
        stack.push(10);

        int min=stack.peek();

        for(int item : stack){
            if(min > item){
                min=item;
            }

        }
        System.out.println("Smallest number is Stack is:"+min);
    }
}
