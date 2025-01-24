import java.util.*;
//Create a Priority queue with 10 elements and print the minimum value out of it.
public class Q14 {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue=new PriorityQueue<>();

        queue.add(56);
        queue.add(66);
        queue.add(76);
        queue.add(86);
        queue.add(96);
        queue.add(16);
        queue.add(6);
        queue.add(556);
        queue.add(576);
        queue.add(596);

        int min=queue.peek();

        System.out.println("\n The item in Priority Queue are:"+queue.toString());
        System.out.println("\n The smallest element in queue is:"+min);
    }
}
