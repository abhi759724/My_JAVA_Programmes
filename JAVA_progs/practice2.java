package My_first;
import java.util.Scanner;
public class practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i,j;  
//	    int space=0;  
	    for(i=0;i<n;i++){// this loop is used to print lines  
//	        for(j=1;j<=space;j++){// this loop is used to print space in a line  
//	            System.out.print(" ");  
//	        }  
	        for(j=1;j<=n;j++){// this loop is used to print numbers in a line  
	            if(j<=(n-i))  
	            System.out.print(j);  
	            else  
	            System.out.print("*");  
	        }  
	        j--;  
	        while(j>0){// this loop is used to print numbers in a line  
	            if(j>n-i)  
	            System.out.print("*");  
	            else  
	            System.out.print(j);  
	            j--;  
	        }  
//	        if((n-i)>9)// this loop is used to increment space  
//	        space=space+1;  
	    System.out.println("");  
	    }  
	}

}
