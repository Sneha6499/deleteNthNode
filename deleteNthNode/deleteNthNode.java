/******************************************************************************

 Online Java Compiler.
 Code, Compile, Run and Debug java program online.
 Write your code in this editor and press "Run" button to execute it.

 *******************************************************************************/

public class List
{
    Node head;

    class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }

    }

    public void addLast(int data){
        Node newNode = new Node(data);
        Node curr=head;
        if(head==null){
            head=newNode;
        }
        while(curr.next!=null){
            curr=curr.next;

        }
        curr.next=newNode;


    }
    public int getSize(){
        int size=0;
        if(head==null){
            return 0;

        }
        Node curr = head;
        while(curr!=null){
            size++;
            curr=curr.next;

        }
        return size;
    }

    public void printList(){
        Node curr=head;
        if(head==null){
            System.out.print("the list is empty");
        }
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();

    }

    public void addfirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;

        }
    }

    public void deletelast(){
        int n=0;
        int p=getSize();
        Node curr=head;
        if(head==null){
            System.out.println("list is empty");
        }

        while(n<p-2){
            curr=curr.next;
            n++;

        }
        curr.next=null;
    }


    public void deleten(int pos){
        Node curr=head;
        Node prev = head;

        if(pos==1){
            deleteFirst();

        }
        if(pos==getSize()-1){
            deletelast();
        }
        while(pos!=1){
            prev=curr;
            curr=curr.next;
            pos--;
        }
        prev.next=curr.next;



    }

    public void deleteFirst(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        head=head.next;

    }

    public void insertnthNode(int pos, int data){
        int l=0;
        Node newNode = new Node(data);
        Node curr= head;
        while(l<pos-1)
        {
            curr=curr.next;
            l++;

        }
        newNode.next=curr.next;
        curr.next=newNode;
    }
    public static void main(String[] args) {
        List ll =new List();
        System.out.println(ll.getSize());
        ll.addfirst(3);
        ll.addfirst(2);
        ll.addfirst(1);
        System.out.println(ll.getSize());

        ll.printList();
        ll.addLast(4);
        ll.addLast(5);
        ll.printList();
        System.out.println(ll.getSize());
        ll.insertnthNode(2,12);
        ll.printList();
        ll.insertnthNode(5,15);
        ll.printList();
        ll.deleteFirst();
        ll.printList();
        ll.deletelast();
        ll.printList();
        ll.deletelast();
        ll.printList();
        System.out.println(ll.getSize());
        ll.deleten(1);

        ll.printList();


    }
}