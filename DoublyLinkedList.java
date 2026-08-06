class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        prev = null;
        next = null;
    }
}


public class DoublyLinkedList {
    static Node head;
    // Insert at end
    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }


    void deleteEnd() {
    if (head == null) {
        System.out.println("List is empty");
        return;
    }
    // Only one node
    if (head.next == null) {
        head = null;
        return;
    }
    Node temp = head;
    // Move to the last node
    while (temp.next != null) {
        temp = temp.next;
    }
    // Remove the last node
    temp.prev.next = null;
}





    // Display forward
    void displayForward() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    void displayBackward()
    {
        if(head==null) return;

        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        while(temp.prev!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.prev;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);

        System.out.println("Forward:");
        list.displayForward();

        list.deleteEnd();
        list.displayForward();

       
    }
}