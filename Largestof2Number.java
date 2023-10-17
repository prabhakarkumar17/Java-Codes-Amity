import java.util.Scanner;
class Largestof2Number{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int a,b;
        System.out.println("Enter first number");
        a=sc.nextInt();
        System.out.println("Enter second number");
        b=sc.nextInt();
        if(a<b){
            System.out.println(" a is smaller than b " );
        }
            if(a==b){
                System.out.println("a is equal to b")
                    }
        else{
            System.out.println(" a is greater than b ");
        }
    }
}
