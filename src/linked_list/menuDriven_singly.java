package linked_list;

import java.util.Scanner;

public class menuDriven_singly {
    public static void main(String[] args) {
        menuDriven_singly m = new menuDriven_singly();
        menuDriven_singly m1 = new menuDriven_singly();
     menuDriven_singly llist1 = new menuDriven_singly();
       menuDriven_singly llist2 = new menuDriven_singly();
        /*create a linked lists 10->15->4->20 */
        llist1.push(20);
        llist1.push(4);
        llist1.push(15);
        llist1.push(10);

        /*create a linked lists 8->4->2->10 */
        llist2.push(10);
        llist2.push(2);
        llist2.push(4);
        llist2.push(8);
        System.out.println("list 1 is ");
        printLL(llist1.head);
        System.out.println("list 2 is ");
        printLL(llist1.head);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1 for display");
        System.out.println("Press 2 for concatenate");
        System.out.println("Press 3 for merge");
        System.out.println("Press 4 for union");
        System.out.println("Press 5 for intersection");
        int value = scanner.nextInt();
        switch (value) {
            case 1:
                printLL(llist1.head);
                printLL(llist2.head);
                break;
            case 2:
                printLL(concatenate(llist1.head,llist2.head));
                break;
            case 3:
                printLL(mergeTwoSortedLL(llist1.head,llist2.head));
                break;
            case 4:
                m.getUnion(llist1.head,llist2.head);
                System.out.println("Union is");
                m.printList();
                break;
            case 5:
                m1.getIntersection(llist1.head,llist2.head);
                System.out.println("intersection is");
                m1.printList();
                break;


        }


    }

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }

    }

    void push(int new_data) {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }
    void printList() {
     Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    boolean isPresent(Node head, int data) {
        Node t = head;
        while (t != null) {
            if (t.data == data)
                return true;
            t = t.next;
        }
        return false;
    }

    void getUnion(Node head1, Node head2) {
        Node t1 = head1, t2 = head2;

        // insert all elements of list1 in the result
        while (t1 != null) {
            push(t1.data);
            t1 = t1.next;
        }

        // insert those elements of list2
        // that are not present
        while (t2 != null) {
            if (!isPresent(head, t2.data))
                push(t2.data);
            t2 = t2.next;
        }
    }

    void getIntersection(Node head1, Node head2) {
        Node result = null;
        Node t1 = head1;

        // Traverse list1 and search each
        // element of it in list2.
        // If the element is present in
        // list 2, then insert the
        // element to result
        while (t1 != null) {
            if (isPresent(head2, t1.data))
                push(t1.data);
            t1 = t1.next;
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

    static Node concatenate(Node head1, Node head2) {
        Node cur = head1;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = head2;
        return head1;
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


