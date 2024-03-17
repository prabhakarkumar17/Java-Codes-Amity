class Node{
  String name;
  Node next;
}

public class LL1 {
  public static void main(String[] args) {
    Node n1=new Node();
    Node n2=new Node();
    Node n3=new Node();
    Node head=new Node();
    Node n4=new Node();
head.next=n1;
n1.name="MSD";
n1.next=n2;
n2.name="Rohit"; 
n2.next=n3;
n3.name="Virat";
n3.next=null;

//if we want to add node n4 at the beginning
n4.name="Hardik";
n4.next=n1;
head.next=n4;
    }
}