package Java_Basics;
import java.util.*;
public class LinkedListMethods {
    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<>();
        ll.addFirst("a");
        ll.addFirst("is");
        ll.addFirst("This");
        ll.add("list");

        System.out.println(ll);
        System.out.println(ll.size());

        for(int i=0;i<ll.size();i++){
            System.out.print(ll.get(i)+" -> ");
        }
        System.out.println("null");

        ll.removeFirst();
        System.out.println(ll);

        ll.removeLast();
        System.out.println(ll);

    }
}
