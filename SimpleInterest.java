import java.util.Scanner;
class SimpleInterest{
    public static void main(String[] args) {
        
       Scanner sc=new Scanner(System.in);
       
       System.out.print("Enter Principal: ");
       int P=sc.nextInt();
       
       System.out.print("Enter Rate of Interest: ");
       int R=sc.nextInt();
       
       System.out.print("Enter Time Period in Years: ");
       int T=sc.nextInt();
       
       float si= (float)P*R*T/100;
       System.out.print("The Simple Interest is: "+si);
    }
}