package My_first;
import java.util.Scanner;
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int sum=0;
		int i=1;
		while(i<=n){
			sum=sum+i;
		    i++;
		}
		System.out.println(sum);
	}

}
