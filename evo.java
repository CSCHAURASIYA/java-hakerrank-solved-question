import java.util.Scanner;
class evo
{
public static void main(String[] args)
 {
Scanner kl=new Scanner(System.in);
System.out.println("enter size array");
int n=kl.nextInt();
int arr[]=new int[n];
for(int i=0; i<n;i++)
{
 arr[i]=kl.nextInt();
 
 }
 
 for(int i=0; i<n;i++)
 {
 {
	 if(arr[i]%10==0)
 System.out.println("div ="+arr[i]);
 else 
 {
	 System.out.println("not div = "+arr[i]);
 }
 }
 
 }
 }
 }