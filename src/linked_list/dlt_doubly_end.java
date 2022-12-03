package linked_list;

public class dlt_doubly_end {
    public static void main(String[] args) {
        Node_endd head=new Node_endd(10);
        Node_endd temp1=new Node_endd(20);
        Node_endd temp2=new Node_endd(30);
        head.next=temp1;
        temp1.prev=head;
        temp1.next=temp2;
        temp2.prev=temp1;
        head=delLast(head);
        printlist(head);
    }
    static Node_endd delLast(Node_endd head){
        if(head==null)return null;
        if(head.next==null){
            return null;
        }
        Node_endd curr=head;
        while(curr.next!=null)
            curr=curr.next;
        curr.prev.next=null;
        return head;

    }

    public static void printlist(Node_endd head){
        Node_endd curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }System.out.println();
    }
}
class Node_endd{
    int data;
    Node_endd prev;
    Node_endd next;
    Node_endd(int d){
        data=d;
        prev=null;
        next=null;
    }
}
