package My_first;

public class array2D_practice {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[][] arr = new int [2][2]; 
//	    for (int i = 0; i < 2; i++) { 
//	        for (int j = 0; j < 2; j++) { 
//	            System.out.print(arr[i][j] + " "); 
//	        } 
//	    } 
//
//	}
//	public static int fun(int[][] arr2d)
//	{
//	    int sum=0;
//	    for(int i=0;i<arr2d.length;i++)
//	    {
//	        for(int j=0;j<arr2d[i].length;j++)
//	        {
//	            sum+=arr2d[i][j];
//	        }
//	    }
//	    return sum;
//	}
//	public static void main(String[] args) 
//	{ 
//	    int[][] arr = { {0,1,2,4,5}, {3,4,5,6,7},{5,6,7,8,9} }; 
//	    System.out.println(fun(arr)); 
//	} 
	public static void  fun(int[][] arr2d)
	{

	    for(int i=0;i<arr2d.length;i++)
	    {
	        for(int j=0;j<arr2d[i].length;j++)
	        {
	            arr2d[i][j]=2*i+j;
	        }
	    }
	}
	public static void main(String[] args) 
	{ 
	    int[][] arr = new int[2][2]; 
	    fun(arr);
	    for(int i=0;i<2;i++)
	    {
	        for(int j=0;j<2;j++)
	        {
	            System.out.print(arr[i][j]+" " );
	        }
	    }
	} 

}
