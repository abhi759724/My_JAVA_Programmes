package My_first;
import java.util.Scanner;
public class triangularpatten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int i = 0;
		int p = 1;
		while(i<n) {
			int j = 1;
			while(j<=i) {
				
				System.out.print(p);
				j++;
				p++;
			}
			System.out.println();
			i++;
		}

	}

}
