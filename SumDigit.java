import java.util.Scanner;
class SumDigit{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

System.out.print("Enter a number: ");
int a=sc.nextInt();
int sum=0;
for(int i=a;a%10!=0;a=a/10)
{
   int b=a%10;
    sum=b+sum;
    
}
System.out.println(sum);
}
}