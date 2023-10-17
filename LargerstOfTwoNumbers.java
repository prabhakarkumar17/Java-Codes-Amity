import java.util.Scanner;
class LargerstOfTwoNumbers {
 public static void main(String[] args){
     System.out.print("Enter 1st No.: ");
	Scanner sc= new Scanner(System.in);
	int a=sc.nextInt();
	System.out.print("Enter 2nd No.: ");
	int b=sc.nextInt();
	if (a>b){
	System.out.print("1st Number is greater");
	}
	if (a<b){
	    System.out.print("2nd Number is greater");
	}
	else {
	    System.out.print("Both Numbers are equal");
	    
	}
 }
}
