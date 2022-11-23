package linked_list;

public class concattttt {
    public static void main(String[] args) {
        Node head1 = new Node(10);
        head1.next = new Node(20);
        head1.next.next = new Node(30);
        head1.next.next.next = new Node(40);

        Node head2 = new Node(5);
        head2.next = new Node(10);
        head2.next.next = new Node(15);
        head2.next.next.next = new Node(20);
        System.out.println("Before the merge");
        System.out.println("Linked list 1");
        printLL(head1);
        System.out.println("Linked list 2");
        printLL(head2);
        System.out.println("After the merge");
        printLL(mergeTwoSortedLL(head1, head2));


    }

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    static void printLL(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }


    static Node mergeTwoSortedLL(Node head1, Node head2) {
        Node head = null, tail = null;
        Node a = head1, b = head2;

        if (a == null) return b;
        if (b == null) return a;

        if (a.data <= b.data) {
            head = a;
            tail = a;
            a = a.next;
        } else {
            head = b;
            tail = b;
            b = b.next;
        }

        while (a != null && b != null) {
            if (a.data <= b.data) {
                tail.next = a;
                tail = a;
                a = a.next;
            } else {
                tail.next = b;
                tail = b;
                b = b.next;
            }
        }

        if (a == null) tail.next = b;
        if (b == null) tail.next = a;

        return head;
    }
}
