import java.util.Scanner;
class calculater
{
  public static void main(String[] args)
  {
   Scanner kl=new Scanner(System.in);

   System.out.println("enter string : ");
   String p=kl.nextLine();
   
   System.out.println("enter value x :");
   int x=kl.nextInt();
   System.out.println("enter value y :");
   int y=kl.nextInt();
   
   switch(p)
   {
	case"add":
	     int c=x+y;
	    System.out.println(" add  "+c);
	    break;
	case "sub":
	     int sub=x-y;
	    System.out.println(" sub  "+sub);
	    break;
	
	case "multi":
	    int multi=x*y;
        System.out.println(" multi "+multi);
	    break;
	
	case "div":
	   int div=x/y;
       System.out.println(" div  "+x/y);
	    break;
	
	case "reminder":
	  int reminder=x%y;
      System.out.println(" reminder  "+reminder);
	   break;
	
	default:
	
		System.out.println(" invalid string   ");
	
	
	
  }
  
 }
}
   