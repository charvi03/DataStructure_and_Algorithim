package linked_list;

public class dlt_doubly_head {
    public static void main(String[] args) {
        Node_dlt head=new Node_dlt(10);
        Node_dlt temp1=new Node_dlt(20);
        Node_dlt temp2=new Node_dlt(30);
        head.next=temp1;
        temp1.prev=head;
        temp1.next=temp2;
        temp2.prev=temp1;
        head=delHead(head);
        printlist(head);
    }
    static Node_dlt delHead(Node_dlt head){
        if(head==null)return null;
        if(head.next==null){
            return null;
        }
        else{
            head=head.next;
            head.prev=null;
            return head;
        }
    }

    public static void printlist(Node_dlt head){
        Node_dlt curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }System.out.println();
    }
}
class Node_dlt{
    int data;
    Node_dlt prev;
    Node_dlt next;
    Node_dlt(int d){
        data=d;
        prev=null;
        next=null;
    }
}
