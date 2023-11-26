import java.util.Scanner;

public class PatternRectangle {
 public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter  digits for row :");
    int r = sc.nextInt();
    
    System.out.println("Enter  digits for column :");
    int c = sc.nextInt();

    for(int i=1; i<=r; i++){
        for(int j=1; j<=c; j++ ){
            System.out.print("*");
        }
        System.out.println(); /*here line changes in order to jump in next rowand blank
                               space show thatnothing more then changing tle line */
    }
 }   
}
