import java.util.*;

class ReverseWordsInString{

	public static String reverseWordsNaive(String str){
		String strArray[] = str.split(" ");
		if(strArray.length == 0) return str;
		
		StringBuilder sb = new StringBuilder();
		for(int i = strArray.length - 1; i > 0; i--){
			sb.append(strArray[i]).append(" ");
		}
		sb.append(strArray[0]);
		return sb.toString();
	}
	
	public static String reverWordsEfficient(String str){
		char[] charArr = str.toCharArray();
		int start = 0;
		for(int end = 0; end < charArr.length; end++){
			if(charArr[end] == ' '){
				reverse(charArr, start, end);
				start = end + 1;
			}
		}
		reverse(charArr, start, charArr.length - 1);
		reverse(charArr, 0, charArr.length - 1);
		
		// One can also use new String(charArr)
		return String.valueOf(charArr);
		
	}
	
	
	public static void main(String args[]){
		String str = "I love coding";
		
		str = reverseWords(String str);
		return;	
	}


}