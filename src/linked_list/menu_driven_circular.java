package linked_list;

import java.util.Scanner;

public class menu_driven_circular {
    public static void main(String[] args) {
        Node_c head=new Node_c(10);
        head.next=new Node_c(5);
        head.next.next=new Node_c(20);
        head.next.next.next=new Node_c(25);
        head.next.next.next.next=head;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1 for display");
        System.out.println("Press 2 to insert at beginning");
        System.out.println("Press 3 to insert at end");
        System.out.println("Press 4 to delete head ");
        System.out.println("Press 5 to delete kth element");
        System.out.println("Press 6 to search an element");
        System.out.println("Press 7 to count number of nodes ");

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
                System.out.println("enter the value to add");
                int d = scanner.nextInt();
                head = deleteKth(head,d);
                printlist(head);
                break;
            case 6:
                find(5,head);
                break;
            case 7:
                System.out.println("There are "+countNodes(head)+" nodes");
                break;

        }

    }
    public static void printlist(Node_c head){
        if(head==null)return;
        System.out.print(head.data+" ");
        for(Node_c r=head.next;r!=head;r=r.next)
            System.out.print(r.data+" ");
    }

    static Node_c insertBegin(Node_c head,int x){
        Node_c temp=new Node_c(x);
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
            return head;
        }
    }
    static int countNodes( Node_c head)
    {
        Node_c temp = head;
        int result = 0;
        if (head != null)
        {
            do
            {
                temp = temp.next;
                result++;
            } while (temp != head);
        }

        return result;
    }
    static void find(int key,Node_c head)
    {
        // temp will traverse the circular
        // linked list for searching element
        Node_c temp = head;

        // counter used to check if
        // element is found or not
        int f = 0;
        if (head == null) {
            System.out.println("List is empty");
        }
        else {
            do {
                if (temp.data == key) {
                    System.out.println(
                            "element is present");
                    f = 1;
                    break;
                }
                temp = temp.next;
            } while (temp != head);
            if (f == 0) {
                System.out.println(
                        "element is not present");
            }
        }
    }
    static Node_c insertEnd(Node_c head,int x){
        Node_c temp=new Node_c(x);
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

    static Node_c delHead(Node_c head){
        if(head==null)return null;
        if(head.next==head)
            return null;
        head.data=head.next.data;
        head.next=head.next.next;
        return head;
    }
    static Node_c deleteKth(Node_c head,int k){
        if(head==null)return head;
        if(k==1)return delHead(head);
        Node_c curr=head;
        for(int i=0;i<k-2;i++)
            curr=curr.next;
        curr.next=curr.next.next;
        return head;
    }

}
class Node_c{
    int data;
    Node_c next;
    Node_c(int d){
        data=d;
        next=null;
    }
    public Node_c head = null;

}

