package My_first;

import java.util.Scanner;

public class findLargest {

	public static int[] takeInputs() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n ;i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	public static int findLargest(int[] arr) {
		int n = arr.length;
		int max = Integer.MIN_VALUE;
		for(int i = 0;i<n;i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);
		return max;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = takeInputs();
		findLargest(arr);
	}

}
