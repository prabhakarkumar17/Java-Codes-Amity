import java.util.Scanner;

class SumOfDigit{
  Scanner sc=new Scanner(System.in){
        System.out.println("Enter the number : ");
  int a=sc.nextInt();
  int sum=0;
  for(int i=a; a%10!=0; i=a/10){
    int b=a%10;
      System.out.println(" sum of  digits :"   + sum+b);
  }
          
    }
}

