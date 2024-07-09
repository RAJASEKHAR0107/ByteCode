package loopsAssignment;
import java.util.*;
public class FourtySixthQ {
	public static void main(String[] args) {
		int n;
		int a,b,c;
		
		System.out.println("1.Addition ");
		System.out.println("2.Substraction ");
		System.out.println("3.Multiplication ");
		System.out.println("4.Division ");
		
		System.out.println("select ur option :");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		System.out.println("enter values :");
		a=sc.nextInt();
		b=sc.nextInt();
		
		switch (n) {
		case 1:
			c=a+b;
			System.out.println(c);
			break;
		case 2:
			c=a-b;
			System.out.println(c);
			break;
		case 3:
			c=a*b;
			System.out.println(c);
			break;
		case 4:
			c=a/b;
			System.out.println(c);
			break;
		default:
			System.out.println("Enter a valid number..");
			break;
		}
	}
}
