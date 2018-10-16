import java.util.Scanner;
public class Main {
  static int a,b,n;
  public static void main(String[] args){  
    System.out.println("1)add");
    System.out.println("2)subtraction");
    System.out.println("3)multiplication");
    System.out.println("4)division");
    System.out.println("enter your choice");
    Scanner in = new Scanner(System.in);
    n = in.nextInt();
    switch(n)
	{  
	case 1:
	    System.out.println("Enter the value of a");
	    a = in.nextInt();
	    System.out.println("a="+a);
	    System.out.println("Enter the value of b");
	    b = in.nextInt();
	    System.out.println("b="+b);
	    int addition=a+b;
	    System.out.println("a+b = "+addition);
	    break;
	case 2:
	   System.out.println("Enter the value of a");
	    a = in.nextInt();
	    System.out.println("a="+a);
	    System.out.println("Enter the value of b");
	    b = in.nextInt();
	    System.out.println("b="+b);
	    int subtraction=a-b;
	    System.out.println("a-b = "+subtraction);
	    break;
	case 3:	
	    System.out.println("Enter the value of a");
	    a = in.nextInt();
	    System.out.println("a="+a);
	    System.out.println("Enter the value of b");
	    b = in.nextInt();
	    System.out.println("b="+b);
	    int multiplication=a*b;
	    System.out.println("a*b = "+multiplication);
	    break;
	case 4:
	    System.out.println("Enter the value of a");
	    a = in.nextInt();
	    System.out.println("a="+a);
	    System.out.println("Enter the value of b");
	    b = in.nextInt();
	    System.out.println("b="+b);
	    int division =a%b;
	    System.out.println("a%b = "+division);
	    break;
	}
    }
}
  
   