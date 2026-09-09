package Java_Basics;
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
class   Stack{
    public  Node head;

    public  boolean isEmpty(){
        return head==null;
    }

    public  void push(int a){
        Node newNode=new Node(a);
        if(isEmpty()){
            head=newNode;
        }else{
            newNode.next=head;
            head=newNode;
        }
    }

    public  int pop(){
        if(isEmpty()){
            return -1;
        }else{
            int val=head.data;
            head=head.next;
            return val;
        }
    }

    public  int peek(){
        if(isEmpty()){
            return -1;
        }
        return head.data;
    }
    
}

public class StackImplementation {
    public static void pushAtBottom(Stack s,int val){
        if(s.isEmpty()){
            s.push(val);
            return;
        }
        int v=s.pop();
        pushAtBottom(s, val);
        s.push(v);
    }

    // Reverse a Stack
    public static void reverseStack(Stack e,Stack s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        e.push(top);
        reverseStack(e, s);
        
    }

    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(0);
        s.push(1);
        s.push(2);
        s.push(3);

        // System.out.println(s.peek());
        // System.out.println(s.pop());
        // System.out.println(s.peek());

        // pushAtBottom(s, 4 );
        Stack e=new Stack();
        reverseStack(e, s);

        while(!e.isEmpty()){
            System.out.println(e.pop());
            
        }


    }
}
