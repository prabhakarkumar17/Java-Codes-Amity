import java.util.Scanner;

public class LargestOfThreeNumber {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter 1st number: ");
    int a=sc.nextInt();

    System.out.print("Enter 2nd number: ");
    int b=sc.nextInt();

    System.out.print("Enter 3rd number: ");
    int c=sc.nextInt();

    if (a>=b && a>=c){
        System.out.println(a+" is Largest");
    }

    else if (b>=a && b>=c){
        System.out.println(b+" is Largest");
    }

    else{
        System.out.println(c+" is Largest");
    }
    
    }
    }
    
