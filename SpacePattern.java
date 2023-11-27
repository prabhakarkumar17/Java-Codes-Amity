 
 import java.util.Scanner;

 public class SpacePattern {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1; i<=1;i++){
            for(int j=1 ; j<=n/2; j++){
                System.out.print(" ");
            }
            System.out.println( "*");
        }
        for(int k=1; k<=n-3; k++){
            for(int l=1; l<=(n-3)-k ; l++){
                System.out.print(" ");
            }
            for(int m=1; m<=(2*k)-1 ; m++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int p=1; p<=2; p++){
        for(int q=1; q<=p; q++){
            System.out.print(" ");
        }
        for(int r=1; r<= (2*p)-1 ; r--){
            System.out.print("*");
        }
        System.out.println();
    }
              for(int s=1; s<=1;s++){
            for(int t=1 ; t<=n/2; t++){
                System.out.print(" ");
            }
            System.out.println( "*");
        }

    
      
        
    }
 
}
