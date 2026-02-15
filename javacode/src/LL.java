public class LL {
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    private int size;
    LL(){
        this.size=0;
    }
    public void addfirst(String data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void printList(){
        if(head==null){
            System.out.println("List is empty. ");
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }
    public void addlast(String data){
        Node newNode=new Node(data);
        Node currNode=head;
        size++;
        if(head==null){
            head=newNode;
            return;
        }
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    public void deletefirst(){
        if(head==null){
            System.out.println("Your Linked list is empty. ");
            return;
        }
        head=head.next;
        size--;

    }
    public void deletelast(){

        if(head==null){
            System.out.println("Your node is empty. ");
            return;
        }
        if(head.next==null){
            head=null;
            size--;
            return;
        }
        Node secondlast=head;
        Node lastnode=head.next;
        while(lastnode.next!=null){
            secondlast=secondlast.next;
            lastnode=lastnode.next;
        }
        secondlast.next=null;
        size--;

    }
    public int size(){
        return this.size;
    }
    public void reverseIterate(){
        if(head==null||head.next==null){
            return;
        }
        Node prevNode=head;
        Node currNode=head.next;
        while(currNode!=null){
             Node nextNode=currNode.next;
             currNode.next=prevNode;

            //  update
            prevNode=currNode;
            currNode=nextNode;
            
        }
        head.next=null;
        head=prevNode;
    }

    public Node reverseRecursive(Node head){
        if(head==null||head.next==null){
            return head;
        }
        Node newHead=reverseRecursive(head.next);
        head.next.next=head;
        head.next=null;

        return newHead;
    }
    public static void main(String args[]){
        LL list=new LL();
        // add first
       list.addfirst("is"); 
       list.addfirst("This");
       list.printList();
       list.addlast("the");
       list.addlast("list");
       list.printList();

       list.deletefirst();
       list.printList();

       list.deletelast();
       list.printList();

       System.out.println("Size of node is : "+list.size());
       list.reverseIterate();
       list.printList();

       list.head=list.reverseRecursive(list.head);
       list.printList();
        
    }
    
}
