package graph;

import java.util.Set;

public class DepthFirstSearch {

    public static void dfs(GraphNode node, Set<GraphNode> visited) {
        if (node == null || visited.contains(node)) {
            return;
        }

        visited.add(node);

        for (GraphNode neighbor : node.neighbors) {
            if (!visited.contains(neighbor)) {
                dfs(neighbor, visited);
            }
        }
    }
}