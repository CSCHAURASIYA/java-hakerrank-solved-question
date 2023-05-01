import java.io.*;
import java.util.*;

class hk7 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
  Scanner sc = new Scanner(System.in);
    //System.out.println("Enter One-Way Fare: ");
    int a= sc.nextInt();
    //System.out.println("Enter Round Trip Fare: ");
    int b = sc.nextInt();
    //System.out.println("Enter Multi-City Fare: ");
    int  c= sc.nextInt();
        int m;
        int n;
        int v;
        int s;
    sc.close();

    if(a==0 || b==0 || c==0)
    {
     System.out.println("Invalid Input");
    }
        else 
        {
            m=(a*1)*(0.1);
			
             System.out.println("m"+m);
            n=(b*2)*(0.2);
			 System.out.println("n"+n);
            v=(c *3)*(0.3);
			 System.out.println("v"+v);
            s=(a-m)+(b-n)+(c-v);
            System.out.println(s);
        }
  }
}