package Java_Basics;

public class LL {
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    private Node head;
    private int size;

    // Add element at First
    public void addFirst(String data){
        size++;
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    // add element at last
    public void addAtLast(String data){
        size++;
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }

    // print element of linkedlist
    public void printElement(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }

    // print size
    public int getSize(){
        return size;
    }

    // delete at first
    public void deleteFirst(){
        
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        size--;
        head=head.next;
    }

    // delete at last
    public void deleteLast(){
        
        if(head==null){
            System.out.println("List is Empty");
            return ;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node currNode=head;
        while(currNode.next.next!=null){
            currNode=currNode.next;
        }
        currNode.next=null;
    }
    LL(){
        this.head=null;
        this.size=0;
    }
    public static void main(String[] args) {
        LL l=new LL();
        l.addFirst("Ritik");
        l.addFirst("Sonal");
        l.addAtLast("Shankar");
        l.addAtLast("Kumar");
        l.addAtLast("This");
        l.addFirst("This");
        l.addFirst("is");



        // l.deleteFirst();
        // l.deleteLast();
        l.deleteFirst();
        l.printElement();
        System.out.println(l.getSize());
    }
    
}
