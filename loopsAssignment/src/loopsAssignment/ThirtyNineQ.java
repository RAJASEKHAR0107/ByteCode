package loopsAssignment;
import java.util.*;
public class ThirtyNineQ {
	public static void main(String[] args) {
		int a,b,T;
		char o;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for a :");
		a=sc.nextInt();
		System.out.println("Enter value for b :");
		b=sc.nextInt();
		System.out.println("Enter any operator :");
		o=sc.next().charAt(0);
		
		switch(o) {
		case '+':
			T=a+b;
			System.out.println("Addition operation done :"+T);
			break;
		case '-':
			T=a-b;
			System.out.println("Substract operation done :"+T);
			break;
		case '*':
			T=a*b;
			System.out.println("Multiplication operation done :"+T);
			break;
		case '/':
			T=a/b;
			System.out.println("Division operation done :"+T);
			break;
		default :
			System.out.println("Please Enter valid operator ");
		}
	}
}
