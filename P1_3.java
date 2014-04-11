package CC150;

import java.util.Arrays;

public class P1_3 {
	public boolean permutation(String str1, String str2){
		if (str1.length() != str2.length()) return false;
		
		/* First try use unnecessary space*/
//		int[] char1 = new int[128];
//		int[] char2 = new int[128];
//		
//		for(int i=0; i<str1.length(); i++){
//			char1[str1.charAt(i)]++;
//			char2[str2.charAt(i)]++;
//		}
//		for(int i=0; i<char1.length; i++){
//			if(char1[i]!=char2[i]){
//				return false;
//			}
//		}
//		return true;
		
		/* Less space use*/
//		int[] char1 = new int[128];
//		char[] s1 = str1.toCharArray();
//		for (char c : s1){
//			char1[c]++;
//		}
//		for (int i=0; i<str2.length(); i++){
//			char1[str2.charAt(i)]--;
//			if(char1[str2.charAt(i)]<0) return false;
//		}
//		return true;
		
		
		/*Sort*/
		return sort(str1).equals(sort(str2));
		
	}
	
	private String sort(String str){  // Have to return String, char[] can not return back
		char[] result = str.toCharArray();
		Arrays.sort(result);
		return new String(result);
	}
}
