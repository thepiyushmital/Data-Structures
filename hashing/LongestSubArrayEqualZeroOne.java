import java.util.*;

class LongestSubArrayEqualZeroOne{
	public static int longestSubArray(int[] arr){
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int max = 0;
		for(int i = 0; i < arr.length; i++){
			if(i == 0){
				if(arr[i] == 0){
					arr[i] = -1;
				}else{
					arr[i] = 1;
				}
				map.put(arr[i], 0);
			}
			else{
				if(arr[i] == 1) arr[i] += arr[i-1];
				else arr[i] = arr[i-1] - 1;
				if(arr[i] == 0){
					max = i + 1;
				}else if(map.containsKey(arr[i])){
					max = max > (i - map.get(arr[i])) ?	 max : (i - map.get(arr[i]) );
				}else{
					map.put(arr[i], i);
				}	
			}
		}
		return max;	
	}
	
	public static void main(String args[]){
		int[] arr = { 1, 0, 1, 1, 1, 1, 0, 0};
		System.out.println(longestSubArray(arr));
		int[] arr2 = { 1, 0, 1, 1, 0, 0};
		System.out.println(longestSubArray(arr2));
	}

}