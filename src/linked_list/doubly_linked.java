package linked_list;

class doubly_linked {
    public static void main(String[] args) {
        Node_linkedList head=new Node_linkedList(10);
        Node_linkedList temp1=new Node_linkedList(20);
        Node_linkedList temp2=new Node_linkedList(30);
        head.next=temp1;
        temp1.prev=head;
        temp1.next=temp2;
        temp2.prev=temp1;
        printlist(head);

    }
    public static void printlist(Node_linkedList head){
        Node_linkedList curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }System.out.println();
    }
}
 class Node_linkedList {
    int data;
    Node_linkedList prev;
    Node_linkedList next;
    Node_linkedList(int d){
        data=d;
        prev=null;
        next=null;
    }
}
