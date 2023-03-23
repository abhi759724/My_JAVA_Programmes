package My_first;

import java.util.Scanner;

public class triangularpattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char n;
		Scanner s = new Scanner(System.in);
		n = s.next().charAt(0);
		int i = 1;
		while(i<=n) {
			int j = 1;
			int p = i;
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
