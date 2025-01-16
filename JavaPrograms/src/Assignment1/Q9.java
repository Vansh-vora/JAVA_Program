import java.util.Scanner;

//Write a Java Program that calculate area of triangle using Constructor. Also
//find area of rectangle using Constructor Overloading.
public class Q9 {
    public static void main(String[] args) {
        Triangle tr1=new Triangle();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter height of Triangle:");
        tr1.height=sc.nextFloat();
        System.out.println("Enter base of Traingle:");
        tr1.base=sc.nextFloat();
        tr1.findArea();

        Triangle tr2=new Triangle();
        System.out.println("Enter height of Triangle:");
        float height=sc.nextFloat();
        System.out.println("Enter base of Traingle:");
        float base=sc.nextFloat();
        tr2.findArea(height,base);
    }
}
class Triangle{
    float height;
    float base;

    void findArea(){
        float area=(height*base)/2;
        System.out.println("Area of Triangle is:"+area);
    }

    void findArea(float height,float base){
        float area=(height*base)/2;
        System.out.println("Area of Triangle is:"+area);
    }


}
