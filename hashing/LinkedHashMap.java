import java.util.*;

class LinkedHashMapDemo{
	public static void main(String args[]){
		
		
		LinkedHashMap<Integer, String> linkHashMap = new LinkedHashMap<Integer, String>();
		linkHashMap.put(1, "Piyush");
		linkHashMap.put(2, "Mital");
		
		// LinkedHashMap maintains the order of insertion in the map and so can be used for that quality
		for(Map.Entry<Integer, String> e : linkHashMap.entrySet()){
			System.out.println("key: " + e.getKey() + ", value: " + e.getValue());
		}
	}	
}