import java.util.*;

class LongestConsecutiveSubsequence{
	public static int longestConsecutiveSubseq(Integer[] arr){
		HashSet<Integer> set = new HashSet<Integer>(Arrays.asList(arr));
		
		int currSize = 0;
		int maxSize = 0;
		while(!set.isEmpty()){
			Iterator<Integer> itr = set.iterator();
			currSize = 1;
			Integer item = itr.next();
			Integer itemGt = item + 1, itemLt =  item - 1;
			while(set.contains(itemGt) || set.contains(itemLt)){
				if(set.contains(itemGt)){
					set.remove(itemGt);
					itemGt++;
					currSize++;
				}
				if(set.contains(itemLt)){
					set.remove(itemLt);
					itemLt--;
					currSize++;
				}
			}
			set.remove(item);
			maxSize = maxSize > currSize ? maxSize : currSize;
		}
		return maxSize;
	}
	
	public static void main(String argsp[]){
		Integer[] arr = {1, 9, 3, 4, 2, 20, 19, 22, 12, 21, 11, 44, 20, 18};
		System.out.println(longestConsecutiveSubseq(arr));
	}
	
}