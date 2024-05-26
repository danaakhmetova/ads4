public class Main {
    public static void main(String[] args) {
        WeightedGraph<String> graph1 = new WeightedGraph<>();
        graph1.addVertex("Alina");
        graph1.addVertex("Dana");
        graph1.addVertex("Saltanat");
        graph1.addVertex("Melan");


        graph1.addEdge("Alina", "Saltanat", 12.52);
        graph1.addEdge("Dana", "Melan", 4.9);
        graph1.addEdge("Dana", "Saltanat", 13.3);


        BFS<String> bfs = new BFS<>(graph1);
        bfs.search("Dana");

        Dijkstra<String> dijkstra = new Dijkstra<>(graph1);
        dijkstra.search("Dana");
        System.out.println("Dist: " + dijkstra.getDistances());
        System.out.println("Pred: " + dijkstra.getPredecessors());

    }
}