package graph;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Set;

public class BreadthFirstSearch {

    public static void bfs(GraphNode node, Set<GraphNode> visited) {
        if (node == null || visited.contains(node)) {
            return;
        }

        Queue<GraphNode> queue = new ArrayDeque<>();

        visited.add(node);
        queue.offer(node);

        while (!queue.isEmpty()) {
            GraphNode current = queue.poll();

            for (GraphNode neighbor : current.neighbors) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.offer(neighbor);
                }
            }
        }

    }
}
