import java.util.*;

class CountIslandsBFS{
		
	public static int solve(int[][] matrix){
		int count = 0;
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				if(matrix[i][j] != 1) continue;
				else{
					recursiveIslandFinder(i, j, matrix);
					count++;
				}
			}
		}
		return count;
	}

	public static void recursiveIslandFinder( int i, int j, int[][] matrix){
		Queue<Map.Entry<Integer, Integer>> queue= new LinkedList<Map.Entry<Integer, Integer>>();
		queue.add(new AbstractMap.SimpleEntry(i, j));
		while(!queue.isEmpty()){
			Map.Entry<Integer, Integer> pair = queue.poll();
			i = pair.getKey();
			j = pair.getValue();
			if(i < matrix.length && i >= 0 && j < matrix[0].length && j >=0 && matrix[i][j] == 1){
				matrix[i][j] = 2;
				for(int k = -1; k < 2; k++){
					for(int m = -1; m < 2; m++){
						if(!(k == 0 && m == 0))
							queue.add(new AbstractMap.SimpleEntry(i + k, j+m));
					}
				} 
			}
		}
		return;
	}
	
	public static void main(String args[]){
		int[][] matrix = {{1,0,0,1}, {0,1,0,1}, {1,1,0,0}, {0,0,0,0}};
		System.out.println(solve(matrix));
		
	}
}
	
	

	