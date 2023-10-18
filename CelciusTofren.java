/*import java.util.*;
public class CelciusTofren{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Reading in Celcius ");
    double c=sc.nextDouble();
    double v=1.8;
    double a=32; 
    double f=(c*v)+a;
    System.out.println("Fahrenheit value " +f);


    }
}*/
import java.util.Scanner;
public class CelciusTofren{
    public static void main(String arg[]){
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter value in Celcius ");
    double c=obj.nextDouble();
    double F=(c*9/5)+32;
    System.out.println("Value converted in Fahrenheit " +F);
}
}