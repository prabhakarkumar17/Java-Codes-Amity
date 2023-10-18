import java.util.Scanner;
public class BasicCalculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number ");
        int a=sc.nextInt();
        System.out.println("Enter second number ");
        int b=sc.nextInt();
        int sum=a+b;
        int mult=a*b;
        int diff=a-b;
        double div=a/b;
       // System.out.print("=" sum \n mult \n diff \n div ); 
       System.out.println("=" +sum);
       System.out.println("=" +mult);
       System.out.println("=" +diff);
       System.out.print("=" +div);
    }
}