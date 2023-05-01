import java.util.Scanner;
class Students
{
int students=50;
void array_read()
{
Scanner kl=new Scanner(System.in);
int arr[]=new int[50];
int a=0;
int cav=1;
for(int i=0;i<50;i++)
{
 arr[i]=kl.nextInt();
 a+=arr[i];
  cav= a/50 ;
}
//int cav= a/50 * 100;
System.out.println("class average ="+cav);

}
}
class MainStud
{
public static void main(String[] args)
{
  Students c=new Students();
  c.array_read();

}
}