package My_first;

import java.util.Scanner;

public class functionswith2Darrray {
	
	public static int[][] takeInputs(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows ");
		int rows = s.nextInt();
		System.out.println("Enter the number of columns ");
		int cols = s.nextInt();
		int[][] arr2D = new int[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.println("Enter the element in "+i+"th row and "+j+"th column");
				arr2D[i][j] = s.nextInt();
			}
		}
		return arr2D;
	}
	public static void print2DArray(int[][] arr2D){
		int rows = arr2D.length;
		int cols = arr2D[0].length;
		for(int i = 0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(arr2D[i][j]+ " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] inputs = takeInputs();
		print2DArray(inputs);
	}

}
