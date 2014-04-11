package CC150;

public class P1_5 {
	
	/* Wrong! can't move p2 by 1 each time - the count number could >10*/
//	public String compression(String str){
//		char[] chars = str.toCharArray();
//		int len = chars.length;
//		char[] newString = new char[len];
//		int p2 = 0; // point to last insert char
//		for(int p1=0; p1<len; p1++){ // point to next ready-to-insert char
//			if (p2 == len) return str;
//			if (chars[p1] == newString[p2]) {
//				newString[p2+1]++;
//			} else {
//				p2 += 2;
//				newString[p2] = chars[p1];
//				newString[p2+1] = '1'; // Put numbers into a char[] only works for 0~9
//			}
//		}
//		return new String(newString); // Or String.valueOf(newString) 
									  //--  both are creating a new String
//	}
	
	/* Simple Solution using String concatenation*/
//	public String compression(String str){
//		String myStr = "";
//		int counter = 1;
////		int last = 0;  Don't need a pointer. We only need to know the last value,
////						so just save the value
//		char last = str.charAt(0);
//		for (int i=1; i<str.length(); i++){
//			if (str.charAt(i) == myStr.charAt(last)){
//				counter++;
//			} else {
//				myStr = myStr + last + counter;
//				last = str.charAt(i);
//				counter = 1;
//			}
//		}
//		return myStr + last + counter;
//	}
	
//	/* String Buffer Solution*/
//	public String compression(String str){
//		int len = countCompress(str);
//		if (str.length() < len) return str;
//		StringBuffer myStr = new StringBuffer();
//		char last = str.charAt(0);
//		int count = 1;
//		for (int i=1; i<str.length(); i++){
//			if (last == str.charAt(i)){
//				count++;
//			} else {
//				myStr.append(last);
//				myStr.append(String.valueOf(count));
//				count = 1;
//				last = str.charAt(i);
//			}
//		}
//		myStr.append(last);
//		myStr.append(String.valueOf(count));
//		return myStr.toString();
//	}
//	
//	private int countCompress(String str) {
//		int size = 0, count = 1;
//		char last = str.charAt(0);
//		for (int i=1; i<str.length(); i++){
//			if (str.charAt(i) == last) {
//				count++;
//			} else {
//				size += String.valueOf(count).length() + 1;
//				count = 1;
//				last = str.charAt(i);
//			}
//		}
//		return size += String.valueOf(count).length() + 1;
//	}
	
	/* Char[] Solution -- revise of my original attempt*/
	public String compression(String str) {
		int len = countCompress(str);
		if (len < 0 || str.length() < len) return str;
		char[] myStr = new char[len];
		
		char last = str.charAt(0);
		int end = 0;
		int count = 1;
		for (int i=1; i<str.length(); i++){
			if (last == str.charAt(i)) {
				count++;
			} else {
				myStr[end] = last;
				end++;
//				char[] num = String.valueOf(count).toCharArray();
//				for (int j=0; j<num.length; j++){
//					myStr[end] = num[j];
//					end ++;
//				}
				end = this.addCount(myStr, count, end);
				last = str.charAt(i);
				count = 1;
			}
		}
		myStr[end] = last;
		end++;
		
        /* Refactoring */
//		char[] num = String.valueOf(count).toCharArray();
//		for (int j=0; j<num.length; j++){
//			myStr[end] = num[j];
//			end += j;
//		}
		this.addCount(myStr, count, end);
		return String.valueOf(myStr);
	}

	private int addCount(char[] myStr, int count, int end){
		char[] num = String.valueOf(count).toCharArray();
		for (int j=0; j<num.length; j++){
			myStr[end] = num[j];
			end++;
		}
		return end;
	}
	
	private int countCompress(String str) {
		int size = 0;
		if (str.equals("") || str == null) return -1;
		char last = str.charAt(0);
		int count = 1;
		for (int i=0; i<str.length(); i++) {
			if (str.charAt(i) == last) {
				count++;
			} else {
				size += String.valueOf(count).length() + 1;
				count = 1;
				last = str.charAt(i);
			}
		}
		return size += String.valueOf(count).length() + 1;
	}
	
}
