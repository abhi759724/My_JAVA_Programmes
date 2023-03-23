package My_first;

public class highestOccuringChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String str = "aaabbccccdd";
		String s = new String("");
		for(int i=0;i<str.length();i++){
			int c=1;
			for(;i<str.length()-1;i++) {
				if(str.charAt(i)==str.charAt(i+1)) {
					c++;
				}
			}
			s+=str.charAt(i);
			if(c>1) {
				s+=c;
			}
		}
		System.out.println(s);

	}

}
