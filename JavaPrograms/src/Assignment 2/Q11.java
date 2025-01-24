import java.util.*;
//Create a class Admin with Id, enrollnment no and name. Create two methods named
//input()
//and display(). Create 5 objects of that class and print all the values of it.
//Note: use Array of Object concept
public class Q11 {
    private int id=0;
    private String name;

    public void input(int id,String name){
        this.id=id;
        this.name=name;
    }
    public void display(){
        System.out.println("\n The id is: "+id);
        System.out.println("\n The name is:"+name);
    }

    public static void main(String[] args) {
        int id=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter no of entries:");
        int len=sc.nextInt();

        Q11[] entries=new Q11[len];

        for(int i=0;i<len;i++){
            System.out.print("\n Enter your name:");
            String name=sc.next();

            id++;

            entries[i]=new Q11();
            entries[i].input(id,name);
        }
        for(Q11 entry : entries){
            entry.display();
        }
        sc.close();
    }
}
