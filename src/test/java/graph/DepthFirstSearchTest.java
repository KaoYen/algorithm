package graph;

import org.junit.Test;

import java.util.LinkedHashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class DepthFirstSearchTest {

    @Test
    public void testDFS() {

        GraphNode node1 = new GraphNode(1);
        GraphNode node2 = new GraphNode(2);
        GraphNode node3 = new GraphNode(3);
        GraphNode node4 = new GraphNode(4);
        GraphNode node5 = new GraphNode(5);

        node1.addNeighbor(node2);
        node1.addNeighbor(node3);
        node2.addNeighbor(node4);
        node3.addNeighbor(node5);

        Set<GraphNode> visited = new LinkedHashSet<>();

        DepthFirstSearch.dfs(node1, visited);

        String expectedOutput = "1 2 4 3 5 ";
        StringBuilder actualOutputBuilder = new StringBuilder();
        for (GraphNode node : visited) {
            actualOutputBuilder.append(node.getVal()).append(" ");
        }
        String actualOutput = actualOutputBuilder.toString();

        assertEquals(expectedOutput, actualOutput);

    }
}
