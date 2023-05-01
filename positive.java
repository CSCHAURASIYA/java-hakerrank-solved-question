import java.util.Scanner;
class positive 
{
  public static void main(String[] args)
  {
   Scanner kl=new Scanner(System.in);
   System.out.println("enter value :-");
   int x =kl.nextInt();
   
   if (x%2==0 && x>0)
   {
    System.out.println("even positive number");
   }
   if (x%2==0 && x<0)
   {
     System.out.println("even negitive number");
   }
   if(x%2==1 && x>0)
   {
   System.out.println("odd positive number");
   }
   if (x%2<=1 && x<0)
   {
    System.out.println("odd negitive number");
   }
   else
   {
     System.out.println(" entered value is zero ");
   }
  }
}
   