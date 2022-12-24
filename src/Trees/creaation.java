package Trees;

public class creaation {
    public static void main(String args[]) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
    }

}

class Node_tree {
    int key;
    Node_tree left;
    Node_tree right;

    Node_tree(int k) {
        key = k;
        left = right = null;
    }
}