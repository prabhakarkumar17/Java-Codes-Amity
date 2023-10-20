import java.util.Scanner;
class SimpleInterest{
    public static void main(String[] args){
Scanner sc=new Scanner (System.in);

System.out.print("Enter the Principal value : ");
double p =(float)sc.nextDouble();

System.out.print("Enter the Rate value : ");
double r =sc.nextDouble();

System.out.print("Enter the time value : ");
double t =sc.nextDouble();

double SI=(p*r*t)/100;

System.out.println("Simple intrest is calculated as  : "+SI);

    }
}
    

