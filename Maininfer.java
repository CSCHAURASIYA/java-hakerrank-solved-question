import java.util.Scanner;
class infer
{
int num1;
int num2;
infer()
{
Scanner kl=new Scanner(System.in);
num1=kl.nextInt();
num2=kl.nextInt();

}
int calculator()
{
	int m=num1*num2;
//System.out.println("multi"+m);
return(m);
}

}
class Maininfer
{
public static void main(String[] args)
{
  infer a1= new infer();
  infer a2= new infer();
  
 int result= a1.calculator();
 System.out.println(result);
  int result1=a2.calculator();
  System.out.println(result1);
}
}