package My_first;

import java.util.Scanner;

public class find_power {
	
	public static int power(int a, int b) {
		int ans = 1;
		for(int i = 1;i<=b;i++) {
			ans*=a;
		}
		System.out.println(ans);
		return ans;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		power(a,b);
		
	}

}
