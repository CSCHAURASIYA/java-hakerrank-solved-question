import java.util.Scanner;
class ph1
{
  public static void main(String[] args)
  {
   Scanner kl=new Scanner(System.in);
   System.out.println("enter the value of n :");
   int n=kl.nextInt();
   int sum=0;
   for(int i=1;i<=n;i++)
   {
    if(i%2==0)
	{
		System.out.println(" even number \n:"+i);
		sum=sum+i;
		
	
	}
	
   }
   System.out.println("sum of even numbers between 1 to "+n+" ="+sum);
  }
 }
   
   
  