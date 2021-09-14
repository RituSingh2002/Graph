import java.util.*;


public class BfsGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
		// n = total number of nodes in graph
		// m=total number of edges in graph
		int n=7,m=7;
		for(int i=0;i<=n;i++) {
			adj.add(new ArrayList<Integer>());
		}
		adj.get(1).add(2);
		adj.get(2).add(1);
		 
		adj.get(2).add(3);
		adj.get(2).add(5);
		adj.get(3).add(2);
		adj.get(3).add(5);
		adj.get(4).add(6);
		adj.get(5).add(3);
		adj.get(5).add(7);
		adj.get(6).add(4);
		adj.get(7).add(2);
		adj.get(7).add(5);
//		for(int i=1;i<=n;i++) {
//			for(int j=0;j<adj.get(i).size();j++) {
//				System.out.print(adj.get(i).get(j)+" ");
//			}
//			System.out.println();
//		}
		
		ArrayList<Integer> bfs=BFS(n,adj);
		for(int i=0;i<=n;i++) {
			System.out.println(bfs.get(i));
		}


	}
	
	public static ArrayList<Integer> BFS(int v,ArrayList<ArrayList<Integer>> adj){
		
		 ArrayList<Integer> ans=new ArrayList<>();
		 int vis[]=new int[v+1];
		 for(int i=1;i<=v;i++) {
			 if(vis[i]==0) {
				 Queue<Integer> s=new LinkedList<>();
				  s.add(i);
				  vis[i]=1;
				  while(!s.isEmpty()) {
					  int node=s.poll();
					  ans.add(node);
					  for(int j=0;j<adj.get(node).size();j++) {
						  if(vis[adj.get(node).get(j)]==0) {
							  vis[adj.get(node).get(j)]=1;
							  s.add(adj.get(node).get(j));
						  }
					  }
				  }
				 
				 
				 
			 }
		 }
		 return ans;
	}
}
