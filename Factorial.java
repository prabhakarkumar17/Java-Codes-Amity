import java.util.Scanner;
class Factorial{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

System.out.print("Enter the number whose factorial you want: ");
int a=sc.nextInt();

int factorial=1;

for(int i=1;i<=a;i++){
factorial=i*factorial;
}

System.out.print("Factorial of the Number entered is: "+factorial);


}
}