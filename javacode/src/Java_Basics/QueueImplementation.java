package Java_Basics;
class Queue{
    int n;
    int[] arr;
    int rear=-1;
    public Queue(int n){
        this.n=n;
        this.arr=new int[n];
    }

    // isEmpty
    public boolean isEmpty(){
        return rear==-1;
    }

    // add
    public void add(int num){
        if(rear==arr.length-1){
            System.out.println("Queue full");
            return;
        }
        rear++;
        arr[rear]=num;
    }

    // remove
    public int remove(){
        if(isEmpty()){
            return -1;
        }
        int front=arr[0];
        for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];
        }
        rear--;
        return front;
    }

    // peak
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return arr[0];
    }

}
public class QueueImplementation {
    public static void main(String[] args) {
        Queue q=new Queue(5);
        System.out.println(q.isEmpty());

        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());

    }
    
}
