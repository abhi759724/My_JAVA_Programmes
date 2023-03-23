package My_first;
import java.util.Scanner;
public class Check_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
//		int f=0;
//		for(int i=1;i<=a;i++) {
//			if(a%i==0) {
//				f++;
//			}
//		}
//		if(f==2) {
//			System.out.println("Prime");
//		}
//		else {
//			System.out.println("Not Prime");
//		}
		int div = 2;
		while(div<=a/2) {
			if(a%div==0) {
				System.out.println("Composite");
				return;
			}
			div+=1;
		}
		System.out.println("Prime");
		
		
	}

}
