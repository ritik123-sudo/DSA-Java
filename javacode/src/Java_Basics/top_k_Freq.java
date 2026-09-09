package Java_Basics;
import java.util.*;
class top_k_Freq {
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] arr=new int[k];

        if(k==1 & nums.length==1){
            arr[0]=nums[0];
            return arr;
        }
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(map.get(nums[i])+1,nums[i]);
                map.remove(nums[i]);
            }else{
                map.put(1,nums[i]);
            }
        }
        List<Integer> list=new ArrayList<>(map.keySet());
        int[] keys=list.stream().mapToInt(Integer :: intValue).toArray();
        Arrays.sort(keys);
        for(int i=0;i<k;i++){
            arr[i]=keys[keys.length-1-i];
        }
        return arr;
        
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k=2;
        int[] res=topKFrequent(nums,k);
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]+" ");
        }
    }
}
