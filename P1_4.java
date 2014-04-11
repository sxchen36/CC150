package CC150;

public class P1_4 {
//	public String replace(char[] str, int size){
		/* First Try need a new copy of the string*/
//		StringBuffer result = new StringBuffer();
//		int count = 0;
//		for (int i = 0; i < str.length; i++){
//			if (str[i] != ' '){
//				count++;
//				result.append(str[i]);
//				if(count == size) break;
//			}else{
//				result.append("%20");
//			}
//		}
//		return result.toString();
//	}
//}
		
		/* Use existed String cuz it's long enough*/
	public void replace(char[] str, int size){
		int counter = 0;
		int len = 0;
		for (int i = 0; i< size; i++) {
			if (str[i] == ' ') counter++;
		}
		len = size + 2*counter;
		str[len]='\0';
		for (int i = size-1; i>=0;){
			if(str[size-1]==' '){
				str[len-1]='0';
				str[len-2]='2';
				str[len-3]='%';
				i=i-3;
			} else {
				str[i]=str[len-1-i];
				i--;
			}

		}
	}
}
