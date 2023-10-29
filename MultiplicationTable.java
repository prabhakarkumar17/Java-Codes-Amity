import java.util.Scanner;
class MultiplicationTable{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

System.out.print("Enter the number whose table you want: ");
int a=sc.nextInt();

int i;
for(i=1;i<=10;i++){

System.out.println(a+"x"+i+"="+i*a);
}

}
}