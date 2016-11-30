/**
 * 
 */
package jyosh.udacity.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Subash
 *
 */
public class Graph {

	List<GraphNode> nodes = new ArrayList<GraphNode>();
	List<GraphEdge> edges =  new ArrayList<GraphEdge>();
	
	public Graph(List<GraphNode> nodes, List<GraphEdge> edges){
		if(nodes!=null)
			this.nodes=nodes;
		if(edges!=null)
			this.edges=edges;		
	}
	
	public void insertNode(GraphNode newNode){
		if(newNode!=null)
			nodes.add(newNode);
	}
	public void insertEdge(int newEdgeVal, int newNodeFromVal,
			int newNodeToVal) {
			GraphNode fromFound = null;
			GraphNode toFound = null;
		      for (GraphNode node: nodes){
		          if (newNodeFromVal == node.value)
		        	  fromFound = node;
		          if (newNodeToVal == node.value)
		        	  toFound = node;
		      }
		      if (fromFound == null){
		    	  fromFound = new GraphNode(newNodeFromVal);
		          nodes.add(fromFound);
		      }
		      if (toFound == null){
		    	  toFound = new GraphNode(newNodeToVal);
		          nodes.add(toFound);
		      }
		      GraphEdge newEdge = new GraphEdge(newEdgeVal, fromFound, toFound);
		      fromFound.edges.add(newEdge);
		      toFound.edges.add(newEdge);
		      edges.add(newEdge);
		      
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
