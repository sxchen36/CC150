package CC150;

import java.util.HashSet;
import java.util.Set;

public class p1_1 {
	public boolean unique(String s){
		/* First try -- too complicate*/
//		Set<Character> set = new HashSet<Character>();
//		for(int i = 0; i < s.length(); i++){
//			char c = s.charAt(i);
//			if(set.contains(c)) {
//				return false;
//			}
//			set.add(c);
//		}
//		return true;
		
		/* Better solution with larger space*/
//		if(s.length() > 128) return false;
//		boolean[] array = new boolean[128];
//		for(int i=0; i<s.length(); i++){  //String cann't use the easy for-loop
//			char c = s.charAt(i);
//			if(array[c]){
//				return false;
//			}
//			array[s.charAt(i)]=true;
//		}
//		return true;
		
		
		/* Bit calculate, assume that there will be only a-z */
		if(s.length() > 128) return false;
		int checker = 0;
		for (int i=0; i<s.length(); i++){
			int c = s.charAt(i)-'a';
			if ((checker & (1 << c)) > 0) return false;
			checker |= 1 << c;
		}
		return true;
	}
}
