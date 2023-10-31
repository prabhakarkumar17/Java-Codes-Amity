import java.util.Scanner;
public class LastDigit {
    public static void main(String[] args){
        Scanner sc =new Scanner (System.in);
        System.out.print("Enter the number : ");
        int a = sc.nextInt(); 
        System.out.println("Last digit of given number is : " +a%10 );
    }
    
}
