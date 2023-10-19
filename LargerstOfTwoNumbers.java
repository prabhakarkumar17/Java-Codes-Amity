import java.util.Scanner;
class largest {
 public static void main(String[] args){
     System.out.print("Enter 1st No.: ");
	Scanner sc= new Scanner(System.in);
	int a=sc.nextInt();
	System.out.print("Enter 2nd No.: ");
	int b=sc.nextInt();

	if (a>b){
	System.out.print("1st Number is greater");
	}
	else if(b>a) {
	    System.out.print("2nd Numbersis greater");
	    
	} else {
        System.out.println("Both numbers are equal");
    }
 }
}
