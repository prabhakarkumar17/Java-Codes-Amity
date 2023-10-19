import java.util.*;
class Largest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter value of a : ");
        double a=sc.nextDouble();

        System.out.print("Enter value of b : ");
        double b=sc.nextDouble();

        System.out.print("Enter value of c : ");
        double c=sc.nextDouble();

        if(a>b && a>c){
          System.out.print("a is greater than b and c that is :" +a );  
        }
        else if(b>a && b>c){
            System.out.print("b is greater than a and c  that is :" +b);
        }
        else{
            System.out.print("c is greater than a and b that is  :" +c);
        }
    }
}