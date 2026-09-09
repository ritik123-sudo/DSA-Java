package Java_Basics;
import java.util.Stack;
class QueueUsingStack{
    Stack<Integer> s1=new Stack<>();
    Stack<Integer> s2=new Stack<>();

    public boolean isEmpty(){
        if(s1.isEmpty()){
            return true;
        }
        return false;
    }

    public void add(int data){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(data);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    public int remove(){
        if(s1.isEmpty()){
            System.out.println("Empty Queue");
            return -1;
        }
        return s1.pop();
    }

    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return s1.peek();
    }

}
public class QueueUsinStack {
    
    public static void main(String[] args) {
        QueueUsingStack q=new QueueUsingStack();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
    
}
