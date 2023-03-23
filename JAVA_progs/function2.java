package My_first;
import java.util.Scanner;
public class function2 {
	
	public static void tempTable(int start, int gap, int end) {
		
		int i = start;
		while(i<=end) {
			int c = (i - 32)*5;
			int d = c/9;
			String p = i+" "+d;
			System.out.println(p);
			i = i + gap;
			d = d + gap;
			
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int start = s.nextInt();
		int gap = s.nextInt();
		int end = s.nextInt();
		tempTable(start,gap,end);
	}

}
