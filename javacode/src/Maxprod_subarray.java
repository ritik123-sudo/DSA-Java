public class Maxprod_subarray {
    public static void main(String[] args){
        int[] arr={2,5,3,-3,0,8};
        int n=arr.length;
        int temp;
        int max=1;
        for(int i=0;i<n;i++){
            temp=arr[i];
            for(int j=i+1;j<n;j++){
                temp=temp*arr[j];
                max=Math.max(temp,max);
                
            }
            
        }
        System.out.println(max);
    }
    
}
