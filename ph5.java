import java.util.Scanner;
class ph5
{
  public static void main(String[] args)
  {
   Scanner kl=new Scanner(System.in);
   int arr[]=new int[10];
   for (int i=0;i<10;i++)
   {
	System.out.println("enter array value : ");
    arr[i]=kl.nextInt();
	System.out.println("enter stored  array value : "+arr[i]);
     
   }
  }
 }