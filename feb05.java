/*import java.util.*;
class feb05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter vertices:");
        int v = sc.nextInt();
        System.out.println("Enter edges:");
        int e = sc.nextInt();
        System.out.println("Is directed (true/false):");
        boolean d = sc.nextBoolean();
        Graph g = new Graph(v, d);
        System.out.println("Enter source, destination, weight:");
        for (int i=1;i<=e;i++) {
            int s=sc.nextInt();
            int d1=sc.nextInt();
            int w=sc.nextInt();
            g.addEdge(s,d1,w);
        }
        g.printGraph();
        g.bfs(0);
        g.dfs(0);
    }
}
class Graph {
    int vertex;
    boolean directed;
    ArrayList<ArrayList<int[]>> adjlist;
    Graph(int vertex, boolean directed) {
        this.vertex = vertex;
        this.directed = directed;
        adjlist = new ArrayList<>();
        for (int i=0;i<vertex;i++) {
            adjlist.add(new ArrayList<>());
        }
    }
    void addEdge(int source, int destination, int weight) {
        adjlist.get(source).add(new int[]{destination, weight});
        if (!directed) {
            adjlist.get(destination).add(new int[]{source, weight});
        }
    }
    void printGraph() {
        System.out.println("Adjacency List:");
        for (int i=0;i<vertex;i++) {
            System.out.print(i+"->");
            for (int[] edge:adjlist.get(i)) {
                System.out.print("["+edge[0] +","+edge[1] +"]");
            }
            System.out.println();
        }
    }
   public void dfs(int start) {
        boolean[] visited=new boolean[vertex];
        System.out.println("DFS Traversal"+ start +":");
        dfsHelper(start,visited);
        System.out.println();
    }
     void dfsHelper(int node,boolean[] visited) {
        visited[node]=true;
        System.out.print(node+" ");
        for (int[] edge:adjlist.get(node)) {
            int neighbor=edge[0];
            if (!visited[neighbor]) {
                dfsHelper(neighbor,visited);
            }
        }
    }
    public void bfs(int start) {
        boolean[] visited=new boolean[vertex];
        Queue<Integer> q=new LinkedList<>();
        visited[start]=true;
        q.add(start);
        System.out.println("BFS Traversal"+start+":");
        while (!q.isEmpty()) {
            int node=q.poll();
            System.out.print(node+" ");
            for (int[] edge:adjlist.get(node)) {
                int neighbor=edge[0];
                if (!visited[neighbor]) {
                    visited[neighbor]=true;
                    q.add(neighbor);
                }
            }
        }
        System.out.println();
    }
}*/

