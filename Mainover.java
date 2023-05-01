import java.util.Scanner;
class over
{
 void add(int a ,int b)
{
  
   System.out.println("two int "+(a+b));
}
 void add(float c ,float d)
{
 System.out.println("two float "+ (c+d));
 }
  void add(int a,float c)
 {
 System.out.println("one  int & one  float "+ (a+c));
 }
 void add(int a,float c,double v)
 {
 System.out.println(" 4 "+ (a+c+v));
 }
 }
 class Mainover
 {
 public static void main(String[] args)
 {
  //Scanner kl=new Scanner(System.in);
  over o1=new over();
  o1.add(4,5.5f);
 }
 }