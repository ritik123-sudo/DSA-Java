package Java_Basics;

import java.util.*;

public class ArrayListTopic {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        // add elements
        list.add(0);
        list.add(1);
        list.add(2);
        System.out.println(list);

        // get elements
        int ele=list.get(0);
        System.out.println(ele);

        // add ele in between
        list.add(1, 4);
        System.out.println(list);

        // set elemnt at a index
        list.set(0, 5);
        System.out.println(list);

        // remove element
        list.remove(list.size()-1);
        System.out.println(list);

        // size
        System.out.println("Size : "+list.size());

        // sort
        Collections.sort(list);
        System.out.println(list);
    }
}
