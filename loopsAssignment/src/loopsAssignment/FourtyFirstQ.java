package loopsAssignment;
import java.util.*;
public class FourtyFirstQ {
	public static void main(String[] args) {
		int n;
		System.out.println("Enter the number of sides :");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		switch(n) {
		case 3 :
			System.out.println("Triangle");
			break;
		case 4:
			System.out.println("Square");
			break;
		case 5:
			System.out.println("Pentagon");
			break;
		default :
			System.out.println("Enter either 3 or 4 or 5...");
		}
	}
}
