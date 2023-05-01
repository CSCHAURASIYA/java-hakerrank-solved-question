import java.util.Scanner;
class arr
{
public static void main(String[] args)
 {
Scanner kl=new Scanner(System.in);

int  n=kl.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=kl.nextInt();
arr[i]=arr[i]*2;
}


for(int i=0;i<n;i++)
{
	System.out.print(arr[i]+" ");
}
 /*if(arr[i]==arr[(i+1)]-1)
 {
 
 }
 else
 {
   System.out.println(arr[i]+1);
 }
}*/
}
}
