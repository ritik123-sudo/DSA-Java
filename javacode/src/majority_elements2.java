public class majority_elements2 {
    public static int check(int[] arr){
        for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j=1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
                if(count>arr.length/2){
                    return arr[i];
                }
            }

        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={2,5,5,3,4,5,5,2};
        System.out.println(check(arr));
        
                        
    }
    
}
