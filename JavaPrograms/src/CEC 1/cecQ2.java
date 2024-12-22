//Create a method named display details that displays roll no and name of 5 Different Students
//and create another method and fetch the details of rollno and name of 5 diff student.
public class cecQ2 {
    public static void main(String[] args) {
        int rollno;
        String name;
        Students s1=new Students(5,"vansh");
        s1.Display();
        Students s2=new Students(6,"vora");
        s2.Display();
        Students s3=new Students(7,"shah");
        s3.Display();
        Students s4=new Students(8,"jain");
        s4.Display();
        Students s5=new Students(9,"vv");
        s5.Display();


    }
}
class Students{
    int rollno;
    String name;
    Students(int r,String n){
        rollno=r;
        name=n;
    }
    void Display(){
        System.out.println("THe roll no is:"+rollno);
        System.out.println("The name is"+name);
    }
}
