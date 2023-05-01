import java.util.Scanner;
class program5
{
  public static void main(String[] args)
  {
   Scanner f=new Scanner(System.in);
   System.out.println("enter value1");
   int c=f.nextInt();
   System.out.println("enter value2");
   int a=f.nextInt();
   
   int  ans =c|a;
   System.out.println("output"+ans);
  }
    
}