package Java_Basics;
import java.util.*;
class Solution {
    public static void helper(List<Integer> arr,List<List<Integer>> result,List<Integer> ind){
        if(arr.size()==0){
            result.add(new ArrayList<>(ind));
            return;
        }
        
        for(int i=0;i<arr.size();i++){
            int currDigit=arr.get(i);
            
            
            List<Integer> newArr=new ArrayList<>(arr);
            newArr.remove(i);

            List<Integer> newInd=new ArrayList<>(ind);
            newInd.add(currDigit);
            
            helper(newArr,result,newInd);

            // // backtracking
            // arr.add(i, currDigit);
            // ind.remove(ind.size() - 1);
        }
        
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> arr=new ArrayList<>();
        List<Integer> ind=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            arr.add(nums[i]);
        }
        
        helper(arr,result,ind);
        return result;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3};
        // System.out.println(permute(nums));
        System.out.println('z'-'a');
    }
}
