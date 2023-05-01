import java.util.Scanner;
class Vote
{
  public static void main(String[] args)
  {
   Scanner kl=new Scanner(System.in);
   System.out.println("enter your age : ");
   int x=kl.nextInt();
   
   if(x>=18)
    System.out.println("  you can vote  ");
	else 
	System.out.println(" underage vote ");
  }
 }