package My_first;
import java.util.Scanner;
public class star_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int rows = s.nextInt();
		for(int i = 1 ; i<=rows ; i++) {
			for(int j = 1 ; j <= rows-i ; j++) {
				System.out.print(" ");
			}
			for(int j = 1 ; j <= i ; j++ ) {
				System.out.print("*");
			}
			for(int j = i-1 ; j >= 1 ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		

	}

}
