class Node{
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class LinkedList {
    static Node head;
    static void insertEnd(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
    }

    static void insertBeg(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            newNode=head;
            return;
        }
        newNode.next=head;
        head=newNode;
    }


    static void deletefirst()
    {
        if(head!=null)
        {
            head=head.next;
        }
    }

    
    static void deleteEnd(){
        if(head==null)
        {
            System.out.println("List is empty");
        }
        Node temp=head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
    }


    static void search(int d)
    {
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data==d){
                System.out.println(d+" Element found.");
                return;
            }
            temp=temp.next;
        }
        System.out.println(d+" "+"Element not found.");
    }


    static void display(){
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.print("null");
    }



public static void main(String[] args) {
        System.out.println("Insert At Beginning: ");
        insertEnd(10);
        insertEnd(20);
        insertEnd(30);
        display();
        System.out.println();
        System.out.println("Insert At End: ");
        insertBeg(50);
        insertBeg(60);
        display();
        System.out.println();
        System.out.println("Delete at beginning: ");
        deletefirst();
        display();
        System.out.println();
        System.out.println("Delete at end: ");
        deleteEnd();
        
        display();
        System.out.println();
        search(20);

    }
}
