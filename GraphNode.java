package CC150;

import java.util.ArrayList;

public class GraphNode {
	int value;
	ArrayList<GraphNode> nextlist;
	State state;
	
	public GraphNode(int v){
		value = v;
		nextlist = new ArrayList<GraphNode>();
		state = State.Unvisited;
	}
}
