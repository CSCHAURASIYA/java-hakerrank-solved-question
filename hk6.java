import java.util.Scanner;
class hk6
{
public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner kl=new Scanner(System.in);
        int a=kl.nextInt();
       // kl.nextLine();
        int c;
        
        int rem=a%10;
           
        int d=a/10;
        c=(rem+d)+(rem*d) ;   
     if(a>9 && a<100){
        if(c==a)
        {
            System.out.println("Special two digit number");
        }
		else
			System.out.println(" Not Special two digit number");
	 }
        else
        {
            
        
            System.out.println("Invalid Input");
            
        }
    }
}