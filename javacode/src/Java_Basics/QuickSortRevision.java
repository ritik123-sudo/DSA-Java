package Java_Basics;

public class QuickSortRevision {
    public static int partition(int[] nums,int low ,int high){
        int i=low-1;
        int piv=nums[high];
        for(int j=low;j<high;j++){
            if(nums[j]<piv){
                // swap
                i++;
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        // pivot swap
        i++;
        int temp=nums[i];
        nums[i]=piv;
        nums[high]=temp;
        return i;

    }
    public static void helper(int[] nums,int low,int high){
        if(low>=high){
            return;
        }
        if(low<high){
            int pIdx=partition(nums,low,high);
            helper(nums, low, pIdx-1);
            helper(nums, pIdx+1, high);
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
