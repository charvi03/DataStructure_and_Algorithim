package linked_list;

import java.util.Scanner;

public class menu_driven_doubly {
    public static void main(String[] args) {
        NodeDouble head = new NodeDouble(10);
        NodeDouble temp1 = new NodeDouble(20);
        NodeDouble temp2 = new NodeDouble(30);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1 for display");
        System.out.println("Press 2 to insert at beginning");
        System.out.println("Press 3 to insert at end");
        System.out.println("Press 4 to delete head ");
        System.out.println("Press 5 to delete last");
        int value = scanner.nextInt();
        switch (value) {
            case 1:
                printlist(head);
                break;
            case 2:
                System.out.println("enter the value to add");
                int a = scanner.nextInt();
                head = insertBegin(head, a);
                printlist(head);
                break;
            case 3:
                System.out.println("enter the value to add");
                int b = scanner.nextInt();
                head = insertEnd(head, b);
                printlist(head);
                break;
            case 4:
                head = delHead(head);
                printlist(head);
                break;
            case 5:
                head = delLast(head);
                printlist(head);
                break;

        }


    }

    public static void printlist(NodeDouble head) {
        NodeDouble curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    static NodeDouble insertBegin(NodeDouble head, int data) {
        NodeDouble temp = new NodeDouble(data);
        temp.next = head;
        if (head != null) head.prev = temp;
        return temp;
    }

    static NodeDouble insertEnd(NodeDouble head, int data) {
        NodeDouble temp = new NodeDouble(data);
        if (head == null) return temp;
        NodeDouble curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp;
        temp.prev = curr;

        return head;
    }

    static NodeDouble delHead(NodeDouble head) {
        if (head == null) return null;
        if (head.next == null) {
            return null;
        } else {
            head = head.next;
            head.prev = null;
            return head;
        }
    }

    static NodeDouble delLast(NodeDouble head) {
        if (head == null) return null;
        if (head.next == null) {
            return null;
        }
        NodeDouble curr = head;
        while (curr.next != null)
            curr = curr.next;
        curr.prev.next = null;
        return head;

    }

}

class NodeDouble {
    int data;
    NodeDouble prev;
    NodeDouble next;

    NodeDouble(int d) {
        data = d;
        prev = null;
        next = null;
    }
}
