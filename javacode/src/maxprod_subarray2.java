//import java.util.*;
public class maxprod_subarray2 {
    public static void main(String[] args){
        int[] arr={4,8,5,0,5};
        int curr_max=arr[0];
        int curr_min=arr[0];
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            int temp=Math.max(arr[i],Math.max(arr[i]*curr_max,arr[i]*curr_min));
            curr_min=Math.min(arr[i],Math.min(arr[i]*curr_max,arr[i]*curr_min));
            curr_max=temp;
            max=Math.max(temp,Math.max(max,curr_min));
            //System.out.println(max);

        }
        System.out.println(max);
    }
    
}
