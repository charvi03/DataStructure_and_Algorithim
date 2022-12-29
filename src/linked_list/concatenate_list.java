package linked_list;

public class concatenate_list {
    public static void main(String[] args) {
       Node head1 = new Node(10);
        head1.next = new Node(20);
        head1.next.next = new Node(30);
        head1.next.next.next = new Node(40);

       Node head2 = new Node(5);
        head2.next = new Node(10);
        head2.next.next = new Node(15);
        head2.next.next.next = new Node(20);
        printLL(concatt(head1, head2));
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
    static Node concatt(Node head1, Node head2) {
      Node cur = head1;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = head2;
        return head1;
    }
}
