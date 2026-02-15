
import java.util.*;

public class majority_element {
    public static int check(HashMap<Integer,Integer> map,int[] arr){
        Set<Integer> keys=map.keySet();
        for(Integer key:keys){
            int val=map.get(key);
            if(val>arr.length/2){
                
                System.out.println("No. with highest frequency : "+key);
                return val;
            }

        }
        return -1;

    }
    public static void main(String args[]){
        int[] arr={2,5,5,3,4,3,5};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }
        System.out.println(check(map,arr));
        


    }
    
}
