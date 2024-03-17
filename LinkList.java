/**
 * 1. We have to create Node class
 * 2. Head will point to the list(collection of nodes)
 * 3. addNode() - This will create a new node and add it to the list
 * 4. deleteNode()
 * 5. displayList()
 * Note : Whenever we have to create a newnode then we have to make object of Node class
*/

class Node{
    int data;
    Node next;
}

class LinkList{

    public Node createNode(int value){
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = null;

        return newNode;
    }

    public void addNode(int data, Node head){
        Node newNode = createNode(data);

        if(head.next == null){
            head.next = newNode;
        } else {
            Node temp = new Node();
            temp = head;

            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        // return head;
    }

    public void deleteNode(int value, Node head){
        if(head == null){
            System.out.println("Nothing to delete bro");
        } else {
            Node temp = head;

            while(temp.next.data != value){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }

    public void displayNode(Node head){
        if(head == null){
            System.out.println("List is empty");
        } else {
            Node temp = head;
            while(temp.next != null){
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.print(temp.data);
        }
    }
}

class DemoJava{
    public static void main(String args[]){
        Node head = new Node();
        LinkList l = new LinkList();

        l.addNode(1,head);
        l.addNode(2,head);
        l.addNode(3,head);
        l.addNode(4,head);

        l.displayNode(head);
        System.out.println();

        l.deleteNode(4,head);
        l.displayNode(head);
    }
}
