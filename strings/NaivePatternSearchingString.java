import java.util.*;

class NaivePatterSearchingString{

	public static List<Integer> patternsInString(String str, String pattern){
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int fwdIndex = 0;
		
		for(int i = 0; i < str.length(); i++){
			while(pattern.charAt(fwdIndex) == str.charAt(i + fwdIndex)){
				fwdIndex++;
				
				if((i+fwdIndex) == str.length() && fwdIndex == pattern.length()){
					arr.add(i);
					return arr;
				}else if(i + fwdIndex == str.length()){
					return arr;
				}else if(fwdIndex == pattern.length()){
					arr.add(i);
					i = fwdIndex;
					fwdIndex = 0;
					break;
				}				
			}	
		}
		return arr;
	}
	public static void main(String args[]){
		String str = "ABABAABABBACDCABACD";
		String pattern = "ABAB";
		List<Integer> list = patternsInString(str, pattern);
		for(Integer i  : list){
			System.out.println(i);
		}
	}

}