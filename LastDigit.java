import java.util.Scanner;
class LastDigit{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

System.out.print("Enter a number: ");
int a=sc.nextInt();

System.out.print("Last Digit of the number entered is: "+a%10);
}
}
