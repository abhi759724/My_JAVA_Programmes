package My_first;
import java.util.Scanner;
public class probability {
//	public static double factorial(double num){
//		int fact=1;
//		for(int i=2;i<=num;i++){
//		fact*=i;
//		}
//		return fact;
//		}
//		public static int probability(int n,int x){
//		double Ns,Ne1,Ne2;
//		int Pe;
//		Ns=factorial(8.0)/(factorial(n*1.0)*factorial(8.0-n));
//		Ne1=factorial(4.0)/(factorial(x*1.0)*factorial(4.0-x));
//		Ne2=factorial(4.0)/(factorial(((n-x)*1.0))*factorial((4.0-(n-x))));
//		Pe=(int)(((Ne1*Ne2)/Ns)*100);
//		return Pe;
//		}
	public static double fact(double n){
        int fact = 1;
        for(int i = 2;i<=n ; i++){
            fact*=i;
        }
        return fact;
    }
    public static int probability(int n,int x){
        double p1,p2,p3;
        int prob;
        p1 = fact(4.0)/(fact(((n-x)*1.0))*fact((4.0-(n-x))));
        p2 = fact(4.0)/(fact((4-x)*1.0)*fact(x*1.0));
        p3 = fact(8.0)/(fact((8-n)*1.0)*fact(n*1.0));
        prob = (int)((p1*p2)/p3)*100;
        return prob;
    }

	public static void main(String[] args) {
		
			
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int x = s.nextInt();
		
			System.out.println(probability(n, x));
			}
		// TODO Auto-generated method stub

	

}
