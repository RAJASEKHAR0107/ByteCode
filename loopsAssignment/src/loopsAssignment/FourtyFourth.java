package loopsAssignment;
import java.util.*;
public class FourtyFourth {
	public static void main(String[] args) {
		int n;
		System.out.println("No. of hours did the worker take is :");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		
		
			if(n>=2 && n<=3)
				System.out.println("Highly Efficient Worker");
			if(n>3 && n<=4)
				System.out.println("Worker has to Improve speed");
			if(n>4 && n<=5)
				System.out.println("Taking training to improve speed");
			if(n>5)
				System.out.println("Worker should leave the company");
		
	}
}
