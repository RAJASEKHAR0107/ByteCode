package loopsAssignment;
import java.util.*;
public class ThirtySevenQ {
	public static void main(String[] args) {
		char o;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any operator :");
		o=sc.next().charAt(0);
		
		switch(o) {
		case 'A':
			
			System.out.println("Excellent");
			break;
		case 'B':
			
			System.out.println("Very good");
			break;
		case 'C':
			
			System.out.println("Good");
			break;
		case 'D':
		
			System.out.println("Can do better");
			break;
		case 'E':
			
			System.out.println("Improve urself");
			break;
		case 'F':
			
			System.out.println("FAIL");
			break;
			
		default :
			System.out.println("Please Enter valid operator ");
		}
	}
}
