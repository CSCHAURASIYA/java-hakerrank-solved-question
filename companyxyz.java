import java.util.Scanner;
class companyxyz
{
  public static void main(String[] args)
  {
   Scanner ob=new Scanner(System.in);
   String name;
   System.out.println("enter name =  ");
   name=ob.nextLine();
   
   int age;
    System.out.println("enter age =  ");
	age=ob.nextInt();
   float salary;
    System.out.println("enter salary =  ");
	salary=ob.nextFloat();
   char grade;
    System.out.println("enter grade =  ");
   grade=ob.next().charAt(0);
   
  System.out.println("enter name =  "+name);
  System.out.println("enter age =  "+age);
  System.out.println("enter salary =  "+salary);
  System.out.println("enter grade =  "+grade);
  
  }

}