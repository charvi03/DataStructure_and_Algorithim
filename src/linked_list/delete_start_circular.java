package linked_list;

public class delete_start_circular {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = head;
        head = delHead(head);
        printlist(head);

    }

    public static void printlist(Node head) {
        if (head == null) return;
        Node r = head;
        do {
            System.out.print(r.data + " ");
            r = r.next;
        } while (r != head);
    }

    static Node delHead(Node head) {
        if (head == null) return null;
        if (head.next == head)
            return null;
        head.data = head.next.data;
        head.next = head.next.next;
        return head;
    }
}

class NodeD {
    int data;
    NodeD next;

    NodeD(int d) {
        data = d;
        next = null;
    }
}
