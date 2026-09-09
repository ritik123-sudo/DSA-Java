package Java_Basics;
class Queue{
    public int rear=-1;
    public int front=-1;
    public int[] arr;
    public int n;

    Queue(int n){
        this.n=n;
        this.arr=new int[n];
    }
    public boolean isEmpty(){
        if(front==-1 && rear==-1){
            return true;
        }else{
            return false;
        }
    }

    public boolean isFull(){
        if((rear+1)% arr.length==front){
            return true;
        }
        return false;
    }

    public void add(int n){
        if(isFull()){
            System.out.println("List Full");
        }
        else if(isEmpty()){
            front=0;
            rear=(rear+1) % arr.length;
            arr[rear]=n;
        }else{
            rear=(rear+1)% arr.length;
            arr[rear]=n;
        }
    }
    public int remove(){
        // System.out.println("Remove Called");
        if(isEmpty()){
            System.out.println("Empty Queue");
            return -1;
        }
        int f=arr[front];
        if(rear==front){
            rear=front=-1;
            return f;
        }
        
        front=(front+1)% arr.length;
        return f;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Empty List");
            return -1;
        }
        return arr[front];
    }
}
public class CircularQueue {
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        // System.out.println(q.peek());
        // while(!q.isEmpty()){
        //     System.out.println(q.remove());
        // }
        q.remove();
        q.remove();
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
        System.out.println(q.remove());
        q.peek();
    }
    
}
