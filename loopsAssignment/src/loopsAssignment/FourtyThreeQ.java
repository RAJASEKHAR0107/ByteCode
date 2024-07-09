package loopsAssignment;
import java.util.*;
public class FourtyThreeQ {
	public static void main(String[] args) {
		int n;
		//4@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of days delayed :");
		n=sc.nextInt();
		
		if(n>=1 && n<=5) {
			System.out.println("Fine Rupees 50 paise");
		}
		
		if(n>5 && n<=10) {
			System.out.println("Fine 1 rupees");
		}
		
		if(n>10 && n<=30) {
			System.out.println("Fine 5 rupees");		
		}
		
		if(n>30) {
			System.out.println("Membership is cancelled...");
		}
	}
}
