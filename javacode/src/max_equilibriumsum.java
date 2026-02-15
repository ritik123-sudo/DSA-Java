public class max_equilibriumsum {
    public static void main(String[] args){
    
    int[] arr={2,3,4,8,2,7} ;
    int left=0;
    int right=0;
    int n=arr.length;
    for(int i=0;i<n;i++){
        for(int j=0;j<i;j++){
            left=left+arr[j];
        }
        for(int j=i+1;j<n;j++){
            right=right+arr[j];
        }
        if(left==right){
            System.out.println("Max Equilibrium Index is : "+i);
            System.out.println("Max Equilibrium Sum is : "+ (arr[i]+left));
            System.out.println("Equilibrium sum is : "+left);

        }
        left=0;
        right=0;


    }
}
    
}
