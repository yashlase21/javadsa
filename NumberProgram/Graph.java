import java.util.*;

class Graph {
    private int vertices;
    private List<List<Node>> adjList;

    static class Node implements Comparable<Node> {
        int vertex;
        int weight;

        Node(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }

        public int compareTo(Node other) {
            return this.weight - other.weight;
        }
    }

    public Graph(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination, int weight) {
        adjList.get(source).add(new Node(destination, weight));
        adjList.get(destination).add(new Node(source, weight)); // For undirected graph
    }

    public void dijkstra(int startVertex) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        int[] distances = new int[vertices];
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[startVertex] = 0;
        pq.add(new Node(startVertex, 0));

        while (!pq.isEmpty()) {
            Node current = pq.poll();
            int currentVertex = current.vertex;

            for (Node neighbor : adjList.get(currentVertex)) {
                int newDist = distances[currentVertex] + neighbor.weight;
                if (newDist < distances[neighbor.vertex]) {
                    distances[neighbor.vertex] = newDist;
                    pq.add(new Node(neighbor.vertex, distances[neighbor.vertex]));
                }
            }
        }

        System.out.println("Shortest distances from vertex " + startVertex + ":");
        for (int i = 0; i < vertices; i++) {
            System.out.println("To vertex " + i + " : " + distances[i]);
        }
    }
}

public class DijkstraExample {
    public static void main(String[] args) {
        Graph graph = new Graph(6);
        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 2, 4);
        graph.addEdge(1, 2, 2);
        graph.addEdge(1, 3, 5);
        graph.addEdge(2, 3, 8);
        graph.addEdge(3, 4, 6);
        graph.addEdge(4, 5, 9);
        graph.addEdge(3, 5, 4);

        graph.dijkstra(0);
    }
}
