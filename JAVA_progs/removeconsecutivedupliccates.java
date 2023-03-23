package My_first;

public class removeconsecutivedupliccates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaabbcca";
		String s = new String();
		int n = str.length();
		int i=0;
		int c = Integer.MIN_VALUE;
		while(i<n) {
//			if(c!=(int)str.charAt(i)) {
//				s += str.charAt(i);
//			}
			c = (int)str.charAt(i);
			System.out.println(c);
			i++;
		}
//		System.out.println(s);
//		System.out.println(Integer.MIN_VALUE);
		

	}

}
