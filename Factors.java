import java.util.Scanner;
public class Factors{
    


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a=sc.nextInt();
int flag =0;
        for (int i=2 ; i<=a-1;i++) {
            if (a%i==0){
                flag=flag+1;
                
            }
        }
        
        System.out.println(flag+2);
            
}
}