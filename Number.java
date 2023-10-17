import java.util.Scanner;
class Number
{
	public static void main(String[] args)
       {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the number:");
	  int a =sc.nextInt();
	  
	 if(a%2==0)
	 {
	    a=a*3;
	 System.out.println("Number is even\n"+a);
	 }
	 else
 	  { 
	    a=a*2;
	    System.out.println("Number is odd\n"+a);
  	   }
		
 	      
	}
}
	  