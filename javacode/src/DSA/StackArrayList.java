package DSA;

import java.util.*;


public class StackArrayList {
     class Stack1{
    //     static ArrayList<Integer> list=new ArrayList<>();
    //     public static boolean isEmpty(){
    //         return list.size()==0;
    //     }
    //     public  static void push(int data){

    //         list.add(data);
    //     }
    //     public static int pop(){
    //         int top=list.get(list.size()-1);
    //         list.remove(list.size()-1);
    //         return top;
    //     }
    //     public static int peek(){
    //         int top=list.get(list.size()-1);
    //         return top;
    //     }
        public static void pushAtBottom(int data,Stack<Integer> s){
            if(s.isEmpty()){
                s.push(data);
                return;
            }
            int top=s.pop();
            pushAtBottom(data,s);
            s.push(top);
        }
        public static void ReverseStack(Stack<Integer> s){
            if(s.isEmpty()){
                return;
            }
            int top=s.pop();
            ReverseStack(s);
            pushAtBottom(top,s);

        }

    }
    public static void main(String[] args){
        Stack<Integer> s=new Stack<>();
        //Stack<Integer> newStack=new Stack<>();
         s.push(1);
        s.push(2);
        s.push(3);
        // s.push(4);
        Stack1.ReverseStack(s);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        } 
        
        //Push at the Bottom of Stack
        // while(!s.isEmpty()){
        //     newStack.push(s.pop());
            
        // }
        // s.push(4);
        // while(!newStack.isEmpty()){
        //     s.push(newStack.pop());
            
        // }
        // while(!s.isEmpty()){
        //     System.out.println(s.pop());
        // }
    }
    
}
