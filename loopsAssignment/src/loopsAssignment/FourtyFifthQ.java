package loopsAssignment;
import java.util.*;
public class FourtyFifthQ {
	public static void main(String[] args) {
		int n,count=0;
		System.out.println("Enter number :");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		while(n!=0) {
			n/=10;
			count++;
		}
		System.out.println("The count of numbers in a given number :"+count);
	}
}
