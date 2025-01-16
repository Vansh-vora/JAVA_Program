import java.util.Scanner;

//Write a Java program that will convert length in feet to centimeters using
//copy constructor. And print both the values. [before conversion and after
//conversion]
public class Q10 {
    public static void main(String[] args) {
        Length obj=new Length(25.63);

        System.out.println("The Original Object data:");
        obj.display();

        Length obj2=new Length(obj);
        System.out.println("the duplicate object data:");
        obj2.display();

    }
}
class Length
{
    private double feet;
    private double centimeter;

    public double convertToCenti(double feet){
        return feet=30.48;
    }
    public Length(double feet){
        this.feet=feet;
        this.centimeter=convertToCenti(feet);
    }
    public Length(Length obj){
        this.feet=feet;
        this.centimeter=obj.centimeter;
    }
    public void display(){
        System.out.println("Length is feet:"+feet+"ft");
        System.out.println("Length in centimeter"+centimeter+"cm");
    }
}
