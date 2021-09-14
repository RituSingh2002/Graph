import java.util.*;
public class RepresentationOfGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
		// n = total number of nodes in graph
		// m=total number of edges in graph
		int n=5,m=7;
		for(int i=0;i<=n;i++) {
			adj.add(new ArrayList<Integer>());
		}
		adj.get(1).add(2);
		adj.get(2).add(3);
		adj.get(2).add(4);
		adj.get(3).add(4);
		adj.get(4).add(1);
		adj.get(5).add(3);
		adj.get(1).add(3);
		adj.get(1).add(5);
		for(int i=1;i<=n;i++) {
			for(int j=0;j<adj.get(i).size();j++) {
				System.out.print(adj.get(i).get(j)+" ");
			}
			System.out.println();
		}
		
		

	}

}
