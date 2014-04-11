package CC150;

import java.util.LinkedList;

public class p4_2 {
	/* BFS */
	public boolean hasRoute (GraphNode start, GraphNode end){
		LinkedList<GraphNode> queue = new LinkedList<GraphNode>();
		start.state = State.Visiting;
		queue.add(start);
		while(!queue.isEmpty()){
			GraphNode cur = queue.poll();
			if(cur != null) {
				for (GraphNode v : cur.nextlist){
					if (v == end) return true;
					if (v.state == State.Unvisited) {
						v.state = State.Visiting;
						queue.add(v);
					}
				}
			}
			cur.state = State.Visited;
		}
		return false;
		
	}
}
