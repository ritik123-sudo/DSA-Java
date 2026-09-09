package Java_Basics;

class newQueue{
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public Node head;
    public Node tail;
    newQueue(){
        this.head=null;
        this.tail=null;
    }

    public boolean isEmpty(){
        if(head==null){
            return true;
        }
        return false;
    }

    public void add(int data){
        Node newNode =new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;

    }

    public int remove(){
        if(head==null){
            System.out.println("Empty Queue");
            return -1;
        }
        int top=head.data;
        if(head == tail){
            head = tail = null;
        } else {
            head = head.next;
    }
        return top;
    }

    public int peek(){
        if(head==null){
            System.out.println("Empty Queue");
            return -1;
        }
        return head.data;
    }
}

public class QueueLinkedList {
    public static void main(String[] args) {
        newQueue q=new newQueue();
        q.add(1);
        q.add(5);
        q.add(10);
        q.add(17);

        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}
