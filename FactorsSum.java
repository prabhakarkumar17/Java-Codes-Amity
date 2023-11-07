import java.util.Scanner;
public class FactorsSum {
    
 public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n= s.nextInt();
int sum=1+n;
    for(int i=2;i<=n-1;i++){
        if(n%i==0){
            sum=sum+i;
        }
    }
    System.out.println("the sum of factors is: "+sum);
    
 }
    
}
