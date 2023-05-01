import java.util.Scanner;
class hk51
{
  public static void main(String[]args)
 {
  Scanner kl=new Scanner(System.in);
  System.out.println("enter how many fours ");
  int f=kl.nextInt();
  System.out.println("enter how many six ");
  int s=kl.nextInt();
  if(f==0 || s==0)
     {
      System.out.println("you entered zero ");
  
     }
	 else
	 {
      
      int c=4*f;
	  int s1=6*s;
	  int sum=c+s1;
	  System.out.println("enter total runs  "+sum);
	 }
 }
}