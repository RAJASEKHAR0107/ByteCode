package loopsAssignment;
import java.util.*;
public class FourtySeventhQ {
	public static void main(String[] args) {
		int i,n,a=1;
		System.out.println("Enter a number :");
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(i=n;i>0;i--) {
			a=a*i;
		}
		
		System.out.println("Factorial of a given number :"+a);
	}
}