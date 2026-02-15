import java.util.*;
public class leaders {
    public static void main(String[] args){
        int[] arr={12,13,13,19,19,11,8,11,5,0};
        ArrayList<Integer> result=new ArrayList<>();
        int max_element=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    max_element=arr[j];
                }
            }
            if(!result.contains(max_element))
                result.add(max_element);
        }
        if(!result.contains(arr[arr.length-1]))
                result.add(arr[arr.length-1]);
        
        System.out.println(result);

    }
    
}
