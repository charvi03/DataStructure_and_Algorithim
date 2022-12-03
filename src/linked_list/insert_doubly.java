package linked_list;

public class insert_doubly {
    public static void main(String[] args) {
        Node_insert head=new Node_insert(10);
        Node_insert temp1=new Node_insert(20);
        Node_insert temp2=new Node_insert(30);
        head.next=temp1;
        temp1.prev=head;
        temp1.next=temp2;
        temp2.prev=temp1;
        head=insertBegin(head,5);
        printlist(head);
    }
    static Node_insert insertBegin(Node_insert head,int data){
        Node_insert temp=new Node_insert(data);
        temp.next=head;
        if(head!=null)head.prev=temp;
        return temp;
    }

    public static void printlist(Node_insert head){
        Node_insert curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }System.out.println();
    }
}
class Node_insert{
    int data;
    Node_insert prev;
    Node_insert next;
    Node_insert(int d){
        data=d;
        prev=null;
        next=null;
    }
}