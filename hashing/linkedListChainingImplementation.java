import java.util.*;


class LinkedListHashing{
	ArrayList<ArrayList<Integer>> hashArrayList;
	int size = 7;
	
	public LinkedListHashing(int size){
		this.size = size;
		hashArrayList = new ArrayList<ArrayList<Integer>>(size);
		for(int i = 0; i < size; i++){
			hashArrayList.add(new ArrayList<Integer>());
		}
	}
	
	public LinkedListHashing(){
		hashArrayList = new ArrayList<ArrayList<Integer>>(size);
		for(int i = 0; i < size; i++){
			hashArrayList.add(new ArrayList<Integer>());
		}
	}
	
	
	public void insertElement(int x){
		int hash = x%size;
		int res = Collections.binarySearch(hashArrayList.get(hash), (Integer) x);
		if(res < 0)
			hashArrayList.get(hash).add(x);
		return;
		
	}
	
	public void deleteElement(int x){
		int hash = x%size;
		hashArrayList.get(hash).remove((Integer) x);
		return;
	}
	
	public int searchElement(int x){
		int hash = x%size;
		return Collections.binarySearch(hashArrayList.get(hash), x);		
	}
	
	public void printElements(){
		for(int i = 0; i < hashArrayList.size(); i++){
			for(int j = 0; j < hashArrayList.get(i).size(); j++)
				System.out.println("Level: " + i + ", Element: " + hashArrayList.get(i).get(j));
		}
	}
	

	public static void main(String args[]){
		LinkedListHashing linkListHash = new LinkedListHashing(7);
		linkListHash.insertElement(55);
		linkListHash.insertElement(46);
		linkListHash.insertElement(13);
		System.out.println(linkListHash.searchElement(46));
		System.out.println(linkListHash.searchElement(14));
		
		linkListHash.deleteElement(13);
		linkListHash.insertElement(22);
		linkListHash.insertElement(29);
		linkListHash.insertElement(29);
		linkListHash.printElements();
	}
}








