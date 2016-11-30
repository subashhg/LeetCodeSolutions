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
public class GraphNode {
	int value;
	List<GraphEdge> edges = new ArrayList<GraphEdge>();
	GraphNode (int value){
        this.value = value;
	}

}
