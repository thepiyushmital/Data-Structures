import java.util.*;	

class HashSetDemo{

	// Data type should be non-primitive ie; String, Integer, etc
	
	static HashSet<String> hashSet = new HashSet<String>();
	
	public Set convertArrayToHashSet(String[] str){
		
		// Creating list out of primitive array doesnt require extra aux space
		return new HashSet<String>(Arrays.asList(str));
	}
	
	public static void main(String args[]){
		/*
		Main functions
		1. clear()		O(1)
		2. isEmpty()	O(1)
		3. add()		O(1) on avg
		4. remove()		O(1) on avg
		5. size()		O(1) 
		6. contains()  	O(1) on avg
		*/
		
		hashSet.add("Mital");
		hashSet.add("Piyush");
		hashSet.add("HashSetDemo");	
		
		System.out.println("Size: " + hashSet.size());
		
		
		hashSet.add("Mital");
		hashSet.add("Lists");
		hashSet.remove("Lists");
	
		System.out.println("Contains Lists? " + hashSet.contains("Lists"));
		Iterator<String> itr = hashSet.iterator();
		
		// Order of insertion not maintained while iterating through hashset
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
