package My_first;
import java.util.Scanner;
public class check_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int n = str.length();
		boolean flag = false;
		for(int i=0;i<(n+1)/2;i++) {
			if(str.charAt(i)!=str.charAt(n-i-1)) {
				flag=true;
			}
		}
		if(flag==true) {
			System.out.print("Not a Palindrome");
		}else if(flag==false) {
			System.out.print("Palindrome");
		}
	}

}
