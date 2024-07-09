package loopsAssignment;
public class ThirtyQ {
	public static void main(String[] args) {
		int num=0;
		int n1=0,n2=1,n3=0,i;
		System.out.print(n1+" "+n2);
		for(i=0;i<=10;i++) {
			n3 = n2+n1;
			if(n3!=13) {
				System.out.print(" "+n3);
			}
		n1=n2;
		n2=n3;
	}
}
}
