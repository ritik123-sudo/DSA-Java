package DSA;

public class StackLinkedList {
    //Implement using LinkedList
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    static class StacK1{
        public static Node head;
        //Push element
        public static void push(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                return ;
            }
            newNode.next=head;
            head=newNode;

        }
        //Pop Element
        public static int pop(){
            if(head==null){
                System.out.println("Empty");
                return -1;
            }
            //System.out.println(head.data);
            int top=head.data;
            head=head.next;
            return top;
        }
        public static int peek(){
            if(head==null){
                return -1;
            }
            int top=head.data;
            return top;
        }

    }
    public static void main(String[] args){
        StacK1 s=new StacK1();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
     
        // System.out.println(s.peek());
        // System.out.println(s.pop());
        // System.out.println(s.peek());
        while(s.head!=null){
            System.out.println(s.peek());
            s.pop();
        }
    }



    
}
