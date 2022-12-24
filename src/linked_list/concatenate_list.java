package linked_list;

public class concatenate_list {
    public static void main(String[] args) {
        concattttt.Node head1 = new concattttt.Node(10);
        head1.next = new concattttt.Node(20);
        head1.next.next = new concattttt.Node(30);
        head1.next.next.next = new concattttt.Node(40);

        concattttt.Node head2 = new concattttt.Node(5);
        head2.next = new concattttt.Node(10);
        head2.next.next = new concattttt.Node(15);
        head2.next.next.next = new concattttt.Node(20);
        printLL(concatt(head1, head2));
    }
    static class Node {
        int data;
        concattttt.Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    static void printLL(concattttt.Node head) {
        concattttt.Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    static concattttt.Node concatt(concattttt.Node head1, concattttt.Node head2) {
        concattttt.Node cur = head1;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = head2;
        return head1;
    }
}
