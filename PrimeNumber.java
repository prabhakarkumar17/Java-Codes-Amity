import java.util.Scanner;

class PrimeNumber{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a=sc.nextInt();
int flag =0;
        for (int i=2 ; i<=a-1;i++) {
            if (a%i==0){
                flag=1;
                break;
            }
        }
        if (flag==1){
            System.out.println("It is Not a prime Number");
        }
        else {
            System.out.println("It is a Prime Number");
        }
            
            
        

    }
}