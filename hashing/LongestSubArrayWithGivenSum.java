import java.util.*;

class LongestSubArrayWithGivenSum{
	
	public static void longestSubArraySum(int sum, int[] arr){
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int max = 0;
		int total = 0;
		for(int i = 0; i < arr.length; i++){
			total += arr[i];
			if(total == sum)
				max = i + 1;
			else if(map.containsKey(total - sum))
				max = max > (i - map.get(total - sum)) ? max : (i - map.get(total - sum));
			else
				map.put(total, i);
		}
		
		System.out.println(max > 0 ? max : 0);
	}
	public static void main(String args[]){
		int[] arr1 = {3,1,0,1,8, 2,3, 6 };
		int[] arr2 = {5, 8, -4, -4, 9, 2, -2};
		int[] arr3 = {8, 3, 7};
		longestSubArraySum(5, arr1);
		longestSubArraySum(0, arr2);
		longestSubArraySum(15, arr3);
	}	
}