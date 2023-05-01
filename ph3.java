import java.util.Scanner;
class ph3
{
  public static void main(String[] args)
  {
   Scanner kl=new Scanner(System.in);
   System.out.println("enter the value : ");
   int f=kl.nextInt();
   for(int i=1;i<=9;i++)
   {
	if(i<f)
    System.out.print(i*f+" ");
   }
  }
}