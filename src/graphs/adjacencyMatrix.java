package graphs;

public class adjacencyMatrix {
    public static void main(String[] args) {
        adjacencyMatrix g = new adjacencyMatrix(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);

        System.out.print(g.toString());
    }
    private boolean[][] adjMatrix;
    private int numVertices;

    // Initialize the matrix
    public adjacencyMatrix(int numVertices) {
        this.numVertices = numVertices;
        adjMatrix = new boolean[numVertices][numVertices];
    }

    // Add edges
    public void addEdge(int i, int j) {
        if((i>=0 && i<numVertices)&&(j>=0 && j<numVertices))
        {
            adjMatrix[i][j] = true;
            adjMatrix[j][i] = true;
        }
        else{
            System.out.print("Enter a valid edge input");
        }
    }

    // Remove edges
    public void removeEdge(int i, int j) {
        if((i>=0 && i<numVertices)&&(j>=0 && j<numVertices))
        {
            adjMatrix[i][j] = false;
            adjMatrix[j][i] = false;
        }

        else{
            System.out.println("Enter a valid edge input");
        }
    }

    // Print the matrix
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < numVertices; i++) {
            s.append(i + ": ");
            for (boolean j : adjMatrix[i]) {
                s.append((j ? 1 : 0) + " ");
            }
            s.append("\n");
        }
        return s.toString();
    }
}
