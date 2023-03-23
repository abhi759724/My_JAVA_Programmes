package My_first;

public class substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="abc";
		int n = a.length();
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<=n;j++) {
				System.out.println(a.substring(i,j));
			}
		}

//		System.out.println(a.substring(0,1));
//		System.out.println(a.substring(0,2));
//		System.out.println(a.substring(0,3));
//		System.out.println(a.substring(1,2));
//		System.out.println(a.substring(1,3));
//		System.out.println(a.substring(2,3));
//		
	

	}

}
