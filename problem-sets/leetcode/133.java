import java.util.*;

class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) return null;
        Map<Node, Node> clone_map = new HashMap<>();
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        clone_map.put(node, new Node(node.val));

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            Node current_clone = clone_map.get(current);
            
            for (Node neighbor : current.neighbors) {
                if (!clone_map.containsKey(neighbor)) {
                    clone_map.put(neighbor, new Node(neighbor.val));
                    queue.add(neighbor);
                }
                current_clone.neighbors.add(clone_map.get(neighbor));
            }
        }

        return clone_map.get(node);
    }
}