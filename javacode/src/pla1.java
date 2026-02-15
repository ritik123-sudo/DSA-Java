import java.util.*;
class pla1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No of Rows : ");
        int row=sc.nextInt();
        System.out.println("Enter No of Column : ");
        int column=sc.nextInt();
        int arr[][]=new int[row][column];
        
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int max_sum=0;
        for(int i=0;i<=row-3;i++){
            for(int j=0;j<=column-3;j++){
                int sum=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                System.out.println(sum);
                if(sum>max_sum){
                    max_sum=sum;
                }
            }
        }
        System.out.println("Max sum is : "+max_sum);
        
        sc.close();
    }

}
