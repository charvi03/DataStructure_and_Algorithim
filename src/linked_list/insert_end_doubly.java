package linked_list;

public class insert_end_doubly {
    public static void main(String[] args) {
        Node_end head=new Node_end(10);
        Node_end temp1=new Node_end(20);
        Node_end temp2=new Node_end(30);
        head.next=temp1;
        temp1.prev=head;
        temp1.next=temp2;
        temp2.prev=temp1;
        head=insertEnd(head,40);
        printlist(head);
        
    }
    static Node_end insertEnd(Node_end head,int data){
        Node_end temp=new Node_end(data);
        if(head==null)return temp;
        Node_end curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;
        temp.prev=curr;
        return head;
    }

    public static void printlist(Node_end head){
        Node_end curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }System.out.println();
    }
}
class Node_end{
    int data;
    Node_end prev;
    Node_end next;
    Node_end(int d){
        data=d;
        prev=null;
        next=null;
    }
}
