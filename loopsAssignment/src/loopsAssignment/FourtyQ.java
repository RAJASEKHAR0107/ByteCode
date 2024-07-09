package loopsAssignment;
import java.util.*;
public class FourtyQ {
	public static void main(String[] args) {
		int n;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 1 to 7 :");
		n=sc.nextInt();
		switch(n) {
		case 1 :
			System.out.println("Monday");
			break;
		case 2 :
			System.out.println("Tuesday");
			break;
		case 3 :
			System.out.println("Wednesdaay");
			break;
		case 4 :
			System.out.println("Thursday");
			break;
		case 5 :
			System.out.println("Friday");
			break;
		case 6 :
			System.out.println("Saturday");
			break;
		case 7 :
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Enter a valid number from 1 to 7");
		}
	}
}
