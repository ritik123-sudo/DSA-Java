package Java_Basics;
import java.util.*;
class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] arr=new int[2];
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int t=target-nums[i];
            if(map.containsKey(t)){
                return new int[]{i,map.get(t)};
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] nums={3,2,4};
        System.out.println(twoSum(nums,6));
    }
}