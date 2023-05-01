import java.util.Scanner;
class ph8
{
  public static void main(String[]args)
 {
  Scanner kl=new Scanner(System.in);
  int n=kl.nextInt();
  int a=0;
  int b=1;
  int i=2;
  int c;
  System.out.print(" starting value\n "+a+"  "+b+"  ");
  while(i<n)
  {
  c=a+b;
   System.out.print(c+"  ");
   a=b;
   b=c;
   i++;
  }
 }
}