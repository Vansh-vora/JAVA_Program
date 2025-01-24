import java.util.*;
//Write a Java program to create an Arraylist with 5 elements and perform following
//operations on it:
//• get()
//• contains()
//• remove()
//• sort()
public class Q15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list =new ArrayList<>();

        list.add(56);
        list.add(66);
        list.add(76);
        list.add(86);
        list.add(96);
        list.add(16);
        list.add(6);
        list.add(556);
        list.add(576);
        list.add(596);

        outerloop: while(true){
            System.out.println("\n\nYou can perform following operations on ArrayList: ");
            System.out.println("1. Print number by it's index");
            System.out.println("2. Check weather number exists in list");
            System.out.println("3. Remove any index in list");
            System.out.println("4. Sort the array list");
            System.out.println("5. Print the array list");
            System.out.println("6. exit");
            System.out.print("Enter your choice: ");
            int choice=sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("\nEnter the index you want to print: ");
                    int index=sc.nextInt();

                    if(index>list.size()-1){
                        System.out.println("\nEnter the valid Index");
                        break;
                    }
                    int element=list.get(index);
                    System.out.println("\n The element on index "+index+"is:"+element);
                    break;
                case 2:
                    // to check the number is present in list get number from user
                    System.out.println("\nEnter the number you want to check: ");
                    int num = sc.nextInt();

                    // the contains method is used to get a boolean weather it is present in list or
                    // not
                    if (list.contains(num))
                        System.out.println("The number is there in the list");
                    else
                        System.out.println("The number is not there in the list");
                    break;

                case 3:
                    // get the index that user wants to remove
                    System.out.print("Enter the index you want to remove: ");
                    int idx = sc.nextInt();

                    // remove method removes that element on it's passed idx
                    list.remove(idx);

                    break;

                case 4:
                    // use simple inbuilt method of sort pass null in args
                    list.sort(null);
                    System.out.println("Sorted the array list");

                    break;

                case 5:
                    // print the list using toString
                    System.out.println("The current list is: " + list.toString());

                    break;

                case 6:
                    System.out.println("\nExiting the program");
                    break outerloop;

                default:
                    break;

            }
        }
        sc.close();
    }
}
