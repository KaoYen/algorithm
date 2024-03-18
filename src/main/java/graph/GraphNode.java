package graph;

import java.util.ArrayList;
import java.util.List;

public class GraphNode {

    private final int val;

    List<GraphNode> neighbors;

    public GraphNode(int val) {
        this.val = val;
        neighbors = new ArrayList<>();
    }

    public void addNeighbor(GraphNode neighbor) {
        neighbors.add(neighbor);
    }

    public int getVal() {
        return val;
    }

}
