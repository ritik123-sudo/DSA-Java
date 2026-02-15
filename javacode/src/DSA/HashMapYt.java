package DSA;
import java.util.*;
public class HashMapYt {
    public static void main(String[] args){
        //Country Population
        HashMap<String,Integer> map=new HashMap<>();

        //Insertion
        map.put("India",120 );
        map.put("US",30);
        map.put("China", 150);

        // System.out.println(map);

        // map.put("China", 180);
        // System.out.println(map);

        // //Search
        // if(map.containsKey("China")){
        //     System.out.println("True");
        // }
        // System.out.println(map.get("China"));
        // System.out.println(map.get("Barh"));

        // for(Map.Entry<String,Integer> e : map.entrySet()){
        //     System.out.print(e.getKey()+" ");
        //     System.out.println(e.getValue());
        // }
        // Set<String> keys=map.keySet();
        // for(String key:keys){
        //     System.out.println(key+" "+map.get(key));
        // }
        map.remove("China");
        System.out.println(map);
    }
    
}
