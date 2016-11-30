/**
 * 
 */
package jyosh.udacity.solutions;

/**
 * @author Subash
 *
 */
public class GraphEdge {
	
	int value;
	GraphNode nodeFrom;
	GraphNode nodeto;
	
	public GraphEdge(int value,GraphNode nodeFrom,GraphNode nodeTo){
		this.value=value;
		this.nodeFrom=nodeFrom;
		this.nodeto=nodeTo;		
	}

}
