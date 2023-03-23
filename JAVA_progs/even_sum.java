package My_first;
import java.util.Scanner;
public class even_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int i = 0;
		int evenSum = 0;
		int oddSum = 0;
		while(n>0) {
			int r = n%10;
			if(r%2==0) {
				evenSum+=r;
			}
			else {
				oddSum+=r;
			}
			n = n/10;
		}
		System.out.print(evenSum);
		System.out.print(" ");
		System.out.println(oddSum);

	}

}
