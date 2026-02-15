public class m2Maxequi_sum {
    public static void main(String[] args){
        int[] arr={2,3,4,8,2,7};
        int[] left=new int[6];
        int[] right=new int[6];
        int n=arr.length;
        left[0]=arr[0];
        right[n-1]=arr[n-1];
        for(int i=1;i<n;i++){
            left[i]=arr[i]+left[i-1];
        }
        for(int i=n-2;i>=0;i--){
            right[i]=right[i+1]+arr[i];
        }
        for(int i=0;i<n;i++){
            if(right[i]==left[i]){
                System.out.println(right[i]);
                System.out.println(i);
            }
        }

    }
    
}
