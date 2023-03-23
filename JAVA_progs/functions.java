package My_first;
import java.util.Scanner;
public class functions {

	public static int factorial(int num) {
		int fact = 1;
		for(int i = 1;i<=num;i++) {
			fact *=i ;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		int factn = factorial(n);
		int factr = factorial(r);
		int factnr = factorial(n-r);
		int ncr = factn/(factr*factnr);
		System.out.println(ncr);
	}
}


