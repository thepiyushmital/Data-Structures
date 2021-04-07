import java.util.*;

class PairUnsortedArraySum{
	
	static Set<Integer> hashSet;
	
	public static boolean arraySum(int x, int sum){
		if(hashSet.contains(sum - x)) return true;
		return false;
	}
	
	public static void main(String args[]){	
		Integer[] arr= {1, 88, 99, 66, 6};
		
		// Arrays.asList(arr) works only for NON-PRIMITIVE arrays. 
		hashSet = new HashSet<Integer>(Arrays.asList(arr));
		
		System.out.println(arraySum(77, 78));
		System.out.println(arraySum(71, 78));	
	}

}
