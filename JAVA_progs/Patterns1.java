package My_first;
import java.util.Scanner;
public class Patterns1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		for(int i = 0 ; i < n ; i++) {
			for (int j = 0 ; j < n ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
