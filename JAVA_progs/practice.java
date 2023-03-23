package My_first;
import java.util.Scanner;
public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=n-1;
        int i=1;
        System.out.println("*");
        while(i<=n){
            int j=1;
            int p=1;
            System.out.print("*");
            while(j<=i){
                System.out.print(p);
                p++;
                j++;
            }
            j=1;
            p=i-1;
            while(j<=i-1) {
            	System.out.print(p);
            	p--;
            	j++;
            }
            System.out.println("*");
            //System.out.println();
            i++;
            
        }
        i=n1;
        while(i>=1){
            int j=1;
            int p=1;
            System.out.print("*");
            while(j<=i){
                System.out.print(p);
                p++;
                j++;
            }
            j=1;
            p=i-1;
            while(j<=i-1) {
            	System.out.print(p);
            	p--;
            	j++;
            }
            System.out.println("*");
            //System.out.println();
            i--;
            
        }
        System.out.println("*");
		
//		while(i<=n-1){
//			int curr = s.nextInt();
//			if(prev==curr){
//				System.out.println(false);
//				return;
//			}
//			else if(prev>curr){
//				if(isDec){
//					count++;
//					isDec=false;
//				}
//			}
//			else{
//				if(!isDec){
//					System.out.println(false);
//					return;
//				}
//			}
//			i++;
//			prev=curr;
//		}
//		if(count==1&&isDec==false || count==0&&isDec==true || count==0&&isDec==false){
//			System.out.println(true);
//		}else{
//			System.out.println(false);
//		}
        
    }
	}



