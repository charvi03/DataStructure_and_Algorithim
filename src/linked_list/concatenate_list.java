package linked_list;

public class concatenate_list {
    public static void main(String[] args) {
        NodeFirst<Integer> n1 = new NodeFirst<>(10);
        NodeFirst<Integer> n2 = new NodeFirst<>(20);
        NodeFirst<Integer> n3 = new NodeFirst<>(30);

        NodeFirst<Integer> head = n1;
        n1.next = n2;
        n2.next = n3;

        NodeSecond<Integer> n5 = new NodeSecond<>(40);
        NodeSecond<Integer> n6 = new NodeSecond<>(50);
        NodeSecond<Integer> n7 = new NodeSecond<>(60);

        NodeSecond<Integer> headS = n5;
        n5.next = n6;
        n6.next = n7;
        System.out.println("before concat");
        printLL(head);
        printLs(headS);
        System.out.println("after concat");


    }

    static void printLL(NodeFirst<Integer> head) {
        NodeFirst cur = head;
        while (cur != null) {
            System.out.print(cur.data + " -> ");
            cur = cur.next;
        }
        System.out.println("end");
    }

    static void printLs(NodeSecond<Integer> head) {
        NodeSecond cur = head;
        while (cur != null) {
            System.out.print(cur.data + " -> ");
            cur = cur.next;
        }
        System.out.println("end");
    }

    /*static void concat(NodeFirst<Integer> head1, NodeSecond<Integer> head2) {
        NodeFirst<Integer> cur = head1;
      //  NodeSecond<Integer> cur1 = head2;
        while (cur.next != null) {
            cur = cur.next;
        }
       cur.next=head2;
        head2==null;
        System.out.println(cur);

    }*/
}

class NodeFirst<T> {
    T data;
    NodeFirst<Integer> next;

    public NodeFirst(T data) {
        this.data = data;
    }
}

class NodeSecond<T> {
    T data;
    NodeSecond<Integer> next;

    public NodeSecond(T data) {
        this.data = data;
    }
}