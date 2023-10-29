import java.util.Scanner;
class NatNumSum{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

System.out.print("Enter the natural number upto which you want the sum: ");
int a=sc.nextInt();

int sum=0;

for(int i=1;i<=a;i++){
sum=i+sum;
}

System.out.print("Sum of the Natural Numbers is: "+sum);


}
}