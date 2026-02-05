/*import java.util.*;
class Graph {
    int vertices;
    int[][] adjMat;
    boolean isDirected;
    Graph(int vertices, boolean isDirected) {
        this.vertices = vertices;
        this.isDirected = isDirected;
        adjMat = new int[vertices][vertices];
    }
    public void addEdge(int source, int dest, int weight) {
        if (source < 0 || source >= vertices || dest < 0 || dest >= vertices) {
            System.out.println("Invalid edge: " + source + " -> " + dest);
            return;
        }
        adjMat[source][dest] = weight;
        if (!isDirected) {
            adjMat[dest][source] = weight;
        }
    }
    public void printMatrix() {
        System.out.println("--- Weighted Adjacency Matrix ---");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(adjMat[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void dfs(int start) {
        boolean[] visited = new boolean[vertices];
        System.out.println("DFS Traversal starting from " + start + ":");
        dfsHelper(start, visited);
        System.out.println();
    }

    private void dfsHelper(int start, boolean[] visited) {
        visited[start] = true;
        System.out.print(start + " ");
        for (int i = 0; i < vertices; i++) {
            if (adjMat[start][i] != 0 && !visited[i]) {
                dfsHelper(i, visited);
            }
        }
    }
    public void bfs(int start) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(start);
        System.out.println("BFS Traversal starting from " + start + ":");
        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");
            for (int i = 0; i < vertices; i++) {
                if (adjMat[node][i] != 0 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
        System.out.println();
    }
}

public class matrixgraph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vertices: ");
        int vertices = sc.nextInt();
        System.out.print("Is the graph directed? (true/false): ");
        boolean isDirected = sc.nextBoolean();
        Graph obj = new Graph(vertices, isDirected);
        System.out.print("Enter number of edges: ");
        int edges = sc.nextInt();
        System.out.println("--- Enter the edges (source destination weight) ---");
        for (int i = 0; i < edges; i++) {
            int s = sc.nextInt();
            int d = sc.nextInt();
            int w = sc.nextInt();
            obj.addEdge(s, d, w);
        }
        obj.printMatrix();
        System.out.print("Enter starting vertex for DFS: ");
        int startDFS = sc.nextInt();
        obj.dfs(startDFS);
        System.out.print("Enter starting vertex for BFS: ");
        int startBFS = sc.nextInt();
        obj.bfs(startBFS);

        sc.close();
    }
}*/
