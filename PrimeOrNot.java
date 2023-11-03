 import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args){
    System.out.print("Enter the number : ");
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
     int diff =0;
    for(int i=1; i<=a; i=i+1){
        diff=a-1;
        if(diff%1!=0 || diff%a!=0){
            System.out.println("Number is  prime " );
        }
         
    }
          
System.out.print (" not prime" +diff);
    
  
}
}