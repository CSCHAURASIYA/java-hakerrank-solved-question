import java.util.Scanner;

class ph7
{
  public static void main(String[] args)
  {
    Scanner kl=new Scanner(System.in);
	int rem,sum;
	int d=kl.nextInt();
	sum=0;
	while(d>0)
	{
	rem=d%10;
	sum=sum+rem;
	d=d/10;
	}
	System.out.println(+sum);
  }

}