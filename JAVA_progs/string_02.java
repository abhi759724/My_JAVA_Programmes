package My_first;

public class string_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abhishek";
		String str2 = "abhshike";
		for(int i=0;i<str.length();i++) {
			char p = str.charAt(i);
			if(str2.contains(str.charAt(i))) {
				System.out.println("true");
			}
		}
//		String str1 = "Abhishek";
//		String str2 = "Candey";
//		String str3 = "Pbhi";
//		String str3 = str1 + str2;
//		System.out.println(str3);
//		str1 = str1.concat(str2);
//		System.out.println(str1);
//		str1 = str1 + str2;
//		System.out.println(str1);
//		System.out.println(str1 == str2);
//		System.out.println(str1.equals(str3));
		
		
//		System.out.println(str1.contains("hb"));
//		System.out.println(str1.compareTo(str2));  //The compareTo function returns the difference of length of strings when they are not 
//												   //equal.In case if the lengths are equal, then it returns the non-zero difference in ASCII
//												   //values starting from 0th index to (n-1)st index and if all the indices of string are same,
//												   //it returns 0. 
//		System.out.println(str1.substring(1,5));
	}

}
