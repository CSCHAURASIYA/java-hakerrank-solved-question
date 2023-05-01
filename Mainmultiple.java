import java.util.Scanner;
class Multiple
{
  Scanner kl=new Scanner(System.in);
  int first=kl.nextInt();
  int second=kl.nextInt();
  void method_func()
  {
  if(first%second==0)
  {
    System.out.println("multiple with second num");
	
  }
  else
  {
  System.out.println(" not multiple with second num");
  }
   
  }
  

}
class Mainmultiple
{
public static void main(String[] args)
{
 Multiple m1=new Multiple();
 m1.method_func();


}
}