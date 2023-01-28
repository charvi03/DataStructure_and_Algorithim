package graphs;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class prims {
    static class edge {
        int src;
        int dest;
        int wt;

        public edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<edge>();
        }
        graph[0].add(new edge(0, 1, 10));
        graph[0].add(new edge(0, 2, 15));
        graph[0].add(new edge(0, 3, 30));

        graph[0].add(new edge(1, 0, 10));
        graph[0].add(new edge(1, 3, 40));

        graph[0].add(new edge(2, 0, 15));
        graph[0].add(new edge(2, 3, 50));
        graph[0].add(new edge(3, 1, 40));
        graph[0].add(new edge(3, 2, 50));

    }

    public static class pair implements Comparable<pair> {
        int node;
        int cost;

        public pair(int n, int c) {
            this.node = n;
            this.cost = c;
        }

        @Override
        public int compareTo(pair p2) {
            return this.cost - p2.cost;
        }
    }

    public static void primsAlgo(ArrayList<edge> graph[], int v) {
        PriorityQueue<pair> pq = new PriorityQueue<pair>();
        boolean vis[] = new boolean[v];
        pq.add(new pair(0, 0));
        int mstCost = 0;
        while (!pq.isEmpty()) {
            pair curr = pq.remove();
            if (!vis[curr.node]) {
                vis[curr.node] = true;
                mstCost += curr.cost;
                for (int i = 0; i < graph[curr.node].size(); i++) {
                    edge e = graph[curr.node].get(i);
                    if (!vis[e.dest]) {
                        pq.add(new pair(e.dest, e.wt));
                    }
                }
            }
        }
        System.out.println("min cost = " +mstCost);
    }

    public static void main(String[] args) {
        int v = 4;
        ArrayList<edge> graph[] = new ArrayList[v];
        createGraph(graph);
        primsAlgo(graph,v);
    }
}
