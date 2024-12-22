import java.sql.SQLOutput;

//write a program to take input of name and roll no as instance class
public class cecQ1 {
    public static void main(String[] args) {
        int rollno;
        String name;
        Student s=new Student(5,"vansh");
        s.Display();
    }
}
class Student{
    int rollno;
    String name;
    Student(int r,String n){
        rollno=r;
        name=n;
    }
    void Display(){
        System.out.println("THe roll no is:"+rollno);
        System.out.println("The name is"+name);
    }
}
