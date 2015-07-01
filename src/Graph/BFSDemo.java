package Graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSDemo {
	
	public void BFS(int[][] adj, int s) {
		int len = adj[s-1].length;
		Queue<Integer> queue = new LinkedList<Integer>();
		int[] visited = new int[len];
		int element, i = 1;
		
		queue.add(s);
		while (!queue.isEmpty()) {
			element = queue.poll();
			System.out.print(element + "\t");
			while (i <= len) {
				if (adj[s-1][i-1] == 1 && visited[i-1] == 0) {
					visited[i-1] = 1;
					queue.add(i);
				}
				i++;
			}
		}
	}
	public void BFS2(List list, int s) {
		
	}
	
	public static void main(String[] args) {
//		int[][] adj = {{0,1,0,0,1},{1,0,1,1,1},{0,1,0,1,0},{0,1,1,0,1},{1,1,0,1,0}};
		int[][] adj = {{0,1,0,1,0,0},{0,0,0,0,1,0},{0,0,0,0,1,1},{0,1,0,0,0,0},{0,0,0,1,0,0},{0,0,0,0,0,1}};
		BFSDemo demo = new BFSDemo();
		demo.BFS(adj, 1);
	}
}
