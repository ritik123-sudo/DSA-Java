package DSA;
import java.util.HashSet;
import java.util.Iterator;


public class HashsetYt {
    public static void main(String[] args){

        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        //size
        System.out.println("Size of set is : "+set.size());

        //Print all elements
        System.out.println(set);

    //     if(set.contains(1)) System.out.println("Set Contains 1");
    //     if(!set.contains(6)) System.out.println("Does not contain 6");

    //     set.remove(1);
    //     if(!set.contains(1)){
    //         System.out.println("Does not Contain 1");
    //     }
    //Iterator
    Iterator it=set.iterator();
    while(it.hasNext()){
        System.out.print(it.next()+" ");
    }
    }
}
