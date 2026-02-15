import java.util.*;
public class leadersM2 {
    public static void main(String[] args){
        ArrayList<Integer> result=new ArrayList<>();
        int[] arr={12,13,13,19,19,11,8,11,1,2};
        int n=arr.length-1;
        int max_element=arr[n-1];
        result.add(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>max_element){
                max_element=arr[i];
                result.add(arr[i]);
            }
        }
        
        System.out.println(result);

    }
    
}
