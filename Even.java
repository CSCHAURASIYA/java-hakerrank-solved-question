import java.util.Scanner;
class Even
{
  public static void main(String[] args)
  {
   Scanner kl=new Scanner(System.in);
   
   int i=1;
   while(i<=100)
   {
     if(i%2==0)
	 {
	 System.out.print(i+" , ");
	
	 }
	
	i=i++;
   }
  }