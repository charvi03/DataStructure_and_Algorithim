package linked_list;

public class circular_insert_end {
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=head;
        head=insertEnd(head,15);
        printlist(head);

    }
    public static void printlist(Node head){
        if(head==null)return;
        Node r=head;
        do{
            System.out.print(r.data+" ");
            r=r.next;
        }while(r!=head);
    }

    static Node insertEnd(Node head, int x){
        Node temp=new Node(x);
        if(head==null){
            temp.next=temp;
            return temp;
        }
        else{
            temp.next=head.next;
            head.next=temp;
            int t= (int) head.data;
            head.data=temp.data;
            temp.data=t;
            return temp;
        }
    }
}
class NodeE{
    int data;
    NodeE next;
    NodeE(int d){
        data=d;
        next=null;
    }
}
