package My_first;
import java.util.Scanner;
public class find_max_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
	        int max = 0;
	        for (int i = 1; i < num; i *= 10) {
	            max = Math.max(max, num % i + num / (i * 10) * i);
	        }
	    
	    System.out.println(max);

	}

}
