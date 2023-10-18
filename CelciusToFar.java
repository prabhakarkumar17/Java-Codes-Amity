import java.util.*;

class CelciusToFar{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
        System.out.print("Enter Temperature in Celcius: ");
        double c=sc.nextDouble();
        double f=(c*9/5)+32;
        System.out.print("Temperature in Fahrenheit is: "+f);

    }
}