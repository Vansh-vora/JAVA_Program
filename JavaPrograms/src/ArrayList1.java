import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<Integer>();
        System.out.println("\n Adding an element using Array List");
        a.add(1);
        a.add(22);
        a.add(33);
        a.add(44);
        a.add(1,55);
        System.out.println(a);

        System.out.println("\n Removeing an element using Array List");
        a.remove(2);
        System.out.println(a);

        System.out.println("\n Replacing an element using Array List");
        a.set(2,34);
        System.out.println(a);

        System.out.println("\n Checking the element using Array List");
        a.contains(34);
        System.out.println(a);

        System.out.println("\n Clearing an array using Array List");
        a.clear();
        System.out.println(a);

        System.out.println("\n Displaying Size using Array List");
        a.size();
        System.out.println(a);

        System.out.println("\n To Empty");
        a.isEmpty();
        System.out.println(a);
    }
}
