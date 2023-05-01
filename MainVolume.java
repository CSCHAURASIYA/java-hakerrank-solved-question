import java.util.Scanner;
class Volume
{
int l;
public int w;
 int h;
void get_data()
{
	Scanner kl=new Scanner(System.in);
	System.out.println("enter values");
	l=kl.nextInt();
	w=kl.nextInt();
	h=kl.nextInt();
	

}
void print_data()
{
	System.out.println(l);
	System.out.println(w);
	System.out.println(h);
}
}
class MainVolume
{
  public static void main(String[] args)
 {
  Scanner kl=new Scanner(System.in);
   Volume v=new Volume();
   Volume v1=new Volume();
   
   v.get_data();
   v.print_data();
   /*
   v.l=kl.nextInt();
   v.w=kl.nextInt();
  
   v1.l=kl.nextInt();
   v1.w=kl.nextInt();
  
  System.out.println(v.l);
  System.out.println(v.w);
  System.out.println(Volume.h);
  System.out.println(v1.l);
  System.out.println(v1.w);
  System.out.println(Volume.h);*/
  }
 }
  