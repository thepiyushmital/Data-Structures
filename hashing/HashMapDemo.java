import java.util.*;


class HashMapDemo{
	public static void main(String args[]){
		
		// Can use constructor which takes in the size of the hashmap for further optimization		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
	
		/*
		Main Functions:
		1. void put(String str, Integer i)
		2. Integer get(String str)
		3. boolean containsKey(String str)
		4. boolean isEmpty()
		5. int size()
		6. void remove(String str)
		7. boolean containsValue(Integer i)
		*/
		
		map.put("mital", 0);
		map.put("Piyush", 12);
		map.put("HashMapDemo", 14);
	
		//this returns the data in the map in the form of a set 
		System.out.println(map);		
	
		map.remove("mital");

		//HashMap implements Map interface in java
		// Map interface -> key, value pairs | Set interface -> only keys
		
		// Order not maintained while traversal
		for(Map.Entry<String, Integer> e : map.entrySet()){
			System.out.println(" Key: " + e.getKey() + ", Value: " + e.getValue());
		}
	
		
		
		
	}
}