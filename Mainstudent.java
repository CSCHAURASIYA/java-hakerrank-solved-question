import java.util.Scanner;
class detials

{
static  String  section="E2005";
int roll_no;
float grade;
 detials()
 {
 Scanner kl=new Scanner(System.in);
 
 roll_no=kl.nextInt();
 
 grade=kl.nextFloat();
 }
 void print_detials()
 {
 System.out.println(section);
 System.out.println(roll_no);
 System.out.println(grade);
   
 }
}
class Mainstudent
{
public static void main(String[] args)
{
detials d=new detials();
detials d1=new detials();
detials d2=new detials();
System.out.println("d");
//d.get_detials();
d.print_detials();

System.out.println("d1");
//d1.get_detials();
d1.print_detials();
System.out.println("d3");
//d2.get_detials();
d2.print_detials();

}

}
