package My_first;
import java.util.Scanner;
public class reverseWordsinsentence {
	public static String reverseWordsInString(String input) {
		String ans = "";
		int wordStart = 0;
		int i = 0;
		for(; i < input.length(); i++){
			if(input.charAt(i)==' '){
				int wordEnd = i - 1;
				String reverse = "";
				for(int j = wordStart; j <= wordEnd ; j++){
					reverse = input.charAt(j) + reverse;
				}
				ans += reverse + " ";
				wordStart = i+1;
			}
		}
		int wordEnd = i - 1;
		String reverse = "";
		for(int j = wordStart; j <= wordEnd ; j++){
			reverse = input.charAt(j) + reverse;
		}
		ans += reverse + " ";
		wordStart = i+1;
		return ans;
		if(input.contains('c'));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(reverseWordsInString(input));
	}

}
