import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        System.out.print("Enter the number :");
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=1;
    for(int i=1;i<=a;i++){
         b=(i*b);}
        System.out.print("Factorial of given input : " +b);  
    }  
}
