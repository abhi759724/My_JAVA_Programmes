package My_first;
import java.util.Scanner;
public class nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		if(a>b) {
			if(b>c) {
				System.out.println("a is greater and c is smaller");
			}else {
				System.out.println("a is greater and b is smaller");
			}
		}else if (b>c){
			if(c>a) {
				System.out.println("b is greater and a is smaller");
			}else {
				System.out.println("b is greater and c is smaller");
			}
		}else{
			if(b>a) {
				System.out.println("c is greater and a is smaller");
			}else {
				System.out.println("c is greater and b is smaller");
			}
		}
	}

}
