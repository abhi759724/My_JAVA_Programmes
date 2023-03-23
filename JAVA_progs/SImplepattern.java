package My_first;
import java.util.Scanner;
public class SImplepattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int i = 1;
		while(i<=n) {
			int j = 1;
			while(j<=n) {
				System.out.print(n);
				j++;
			}
			System.out.println();
			i++;
		}
		
	}

}
