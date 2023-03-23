package My_first;
import java.util.Scanner;
public class Arrays_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0;i<n;i++) {
			
			arr[i] = scan.nextInt();
		}
		int sum = 0;
		for(int i = 0;i<n;i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
		

	}

}
