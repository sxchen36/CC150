package CC150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

public class p11_2 {
	
	/* Correct!! Bur too complicated*/
//	public String[] gatherAnagrams(String[] strs){
//		Hashtable<String, Integer> table = new Hashtable<String, Integer>();
//		ArrayList<ArrayList<String>> sort = new ArrayList<ArrayList<String>>();
//		
//		for(String str : strs){
//			String sortedStr = sort(str);
//			if(table.containsKey(sortedStr)){
//				sort.get(table.get(sortedStr)).add(str);
//			} else {
//				sort.add(new ArrayList<String>());
//				int index = sort.size()-1;
//				sort.get(index).add(str);
//				table.put(sortedStr, index);
//			}
//		}
//		
//		String[] newStrs = new String[strs.length];
//		int index = 0;
//		for(int i=0; i<sort.size(); i++){
//			ArrayList<String> tmp = sort.get(i);
//			for(int j=0; j<tmp.size(); j++){
//				newStrs[index] = tmp.get(j);
//				index++;
//			}
//		}
//		return newStrs;
//	}
//	
//	public String sort(String str){
//		char[] chars = str.toCharArray();
//		Arrays.sort(chars);
//		return String.copyValueOf(chars);
//	}
	
	
	/* Redefine the comparator*/
//	public String[] gatherAnagrams(String[] strs){
//		AnagramComparater comparator = new AnagramComparater();
//		Arrays.sort(strs, comparator);
//		return strs;
//	}
//	
//	class AnagramComparater implements Comparator<String>{
//		private String sortChars(String s){
//			char[] tmp = s.toCharArray();
//			Arrays.sort(tmp);
//			return String.copyValueOf(tmp);
//		}
//		public int compare(String s1, String s2){
//			return sortChars(s1).compareTo(sortChars(s2));
//		}
//	}
	
	public String[] gatherAnagrams(String[] strs){
		Hashtable<String, List<String>> table = new Hashtable<String, List<String>>();
		for(String s : strs){
			char[] ch = s.toCharArray();
			Arrays.sort(ch);
			String key = new String(ch);
			if(!table.containsKey(key)){
				table.put(key, new ArrayList<String>());
			}
				table.get(key).add(s);
		}
		int index = 0;
		for (String key : table.keySet()) {
			List<String> list = table.get(key);
			for (String s : list){
				strs[index] = s;
				index++;
			}
		}
		return strs;
	}
	
	
}
