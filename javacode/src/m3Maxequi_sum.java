public class m3Maxequi_sum {
    public static void main(String[] args){
        int[] arr={2,3,4,8,2,7};
        int left=0;
        int sum=0;
        int right=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            right=sum-left-arr[i];
            if(left==right){
                System.out.print(left +arr[i]);
                break;
            }
            left=left+arr[i];
        }
    
    }
}
