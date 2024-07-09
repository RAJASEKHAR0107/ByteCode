package loopsAssignment;
import java.util.*;
public class ThirtyFiveQ {
	public static void main(String[] args) {
		int n = 0;
		int sum = 0;
		while(n>=0) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the value :");
			int a=sc.nextInt();
			if(a<0)
			{
				 break;	
			}
			else if(a>0)
			{
				sum = sum+a;
			}
			 
		}
		System.out.println("Sum = "+sum);
		}
		
	}

