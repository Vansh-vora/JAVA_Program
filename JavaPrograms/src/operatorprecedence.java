public class operatorprecedence {
    public static void main(String[] args) {
        int a=6*5-34/2;
        //highest Precedence goes to * and /.They are then evaluated on the basis of left to right.
        System.out.println(a);
        //Precedence and Associativity
        int b=60/5-34*2;
        System.out.println(b);
        //When precedence is equal then evaluation will be begain from left to right.
        // * / ---> L to R
        // + - ---> L to R
        // ++ = ---> R to L
    }
}
