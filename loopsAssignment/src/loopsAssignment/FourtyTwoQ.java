package loopsAssignment;
import java.util.*;
public class FourtyTwoQ {
	public static void main(String[] args) {
		int Hardness,Tensile;
		float Carbon;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Hardness :");
		Hardness=sc.nextInt();
		System.out.println("Enter Tensile strength :");
		Tensile=sc.nextInt();
		System.out.println("Enter Carbon Content :");
		Carbon=sc.nextFloat();
		
		if(Hardness>=50 && Carbon<=0.7 && Tensile>=5600) {
			System.out.println("Grade = 10");
		}
		else if(Hardness>=50 && Carbon<=0.7){
			System.out.println("Grade = 9");
		}
		else if(Carbon<=0.7 && Tensile>=5600) {
			System.out.println("Grade = 8");
		}
		else if(Hardness>=50 && Tensile>=5600) {
			System.out.println("Grade = 7");
		}
		else if(Hardness>=50 || Carbon<=0.7 || Tensile>=5600) {
			System.out.println("Grade = 6");
		}
		else if(Hardness<=50 && Carbon>=0.7 && Tensile<=5600) {
			System.out.println("Grade = 5");
		}
	}
}
