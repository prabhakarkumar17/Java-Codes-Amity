class Reverseno
{
  public static void main (String [] args)
  {
      int x=0,n=0,var=0;
       n=1234;

   while(n!=0)
     {
       x=n%10;
       n=n/10;
       var=var*10+x;
      }
      System.out.println("Reversed number :" +var);
    }
}