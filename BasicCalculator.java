import java.util.*;
class largest{
    public static void main(String[] args){
        float pi = (float)3.14; //Explicit type conversion - We are converting float value to double value forcefully
        double ee = 567.89f; //Implicit type conversion

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        double a=sc.nextDouble();

        System.out.print("Enter 2nd number: ");
        double b=sc.nextDouble();

        double c=a+b;
        System.out.println("The Sum of a and b is: "+c);

        double d=a-b;
        System.out.println("The Difference of a and b is: "+d);

        double e=a*b;
        System.out.println("The Multiplication of a and b is: "+e);

        double f=a/b;
        System.out.println("The Division of a by b is: "+f);
    }
}
