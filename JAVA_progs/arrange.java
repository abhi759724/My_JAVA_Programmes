package My_first;

import java.util.Scanner;

public class arrange {
	public static int[] takeInputs() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n ;i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	public static void arrange(int[] arr) {
    	//Your code goes here
        int n = arr.length;
        for(int i = 0;i<n;i++){
            if(arr[i]%2==1){
                System.out.print(arr[i]);
            }
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = takeInputs();
		arrange(arr);
	}

}
