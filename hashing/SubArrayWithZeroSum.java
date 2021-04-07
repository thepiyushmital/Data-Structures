import java.util.*;

class SubArrayWithZeroSum{
		/* SOLUTION:
		1. Prefix sum + HashSet
		*/	
		public static boolean containsSubArrayZeroSum(int[] arr){
			HashSet<Integer> hashSet = new HashSet<Integer>();
			for(int i = 0; i < arr.length; i++){
				if(arr[i] == 0 || hashSet.contains(arr[i])) return true;
				else hashSet.add(arr[i]);
			}
			return false;
		}
		
		public static void main(String args[]){
			int arr[] = {1, 4, 13,-3, -10, 14};
			for(int i = 1; i < arr.length; i++){
				arr[i] += arr[i-1];
			}
			System.out.println(containsSubArrayZeroSum(arr));			
		}
}
