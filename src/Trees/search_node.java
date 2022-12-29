package Trees;

import java.util.Scanner;

public class search_node {
    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.right = new Node(20);
        root.right.left = new Node(18);
        root.right.left.left = new Node(16);
        root.right.right = new Node(80);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value to search");
        int a = sc.nextInt();

        if (search(root, a))
            System.out.print("Found");
        else
            System.out.print("Not Found");
    }

    public static boolean search(Node root, int x) {
        if (root == null)
            return false;
        if (root.key == x)
            return true;
        else if (root.key > x) {
            return search(root.left, x);
        } else {
            return search(root.right, x);
        }
    }
}

class Node_s {
    int key;
    Node_s left;
    Node_s right;

    Node_s(int k) {
        key = k;
        left = right = null;
    }
}
