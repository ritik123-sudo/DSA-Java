package Java_Basics;
import java.util.*;
public class QuickSort {
    public static int partition(int []nums,int low,int high){
        int pvtElement=nums[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(nums[j]<pvtElement){
                i++;
                // swap
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        i++;
        // swap with pivot
        int temp=nums[i];
        nums[i]=pvtElement;
        nums[high]=temp;
        return i;

    }
    public static void helper(int nums[],int low,int high){
        if(low>=high){
            return;
        }
        if(low<high){
            int pvtidx=partition(nums,low,high);
            helper(nums,low,pvtidx - 1);
            helper(nums,pvtidx+1,high);
        }
        
    }
    public static void main(String[] args) {
        int nums[]={6,3,9,5,2,8};
        helper(nums,0,nums.length-1);

        for(int i : nums){
            System.out.print(i+" ");
        }
    }
}
