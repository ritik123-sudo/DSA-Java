import java.util.*;

public class Team {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        //Total number of problems
        int no_of_problems=sc.nextInt();
        sc.nextLine();

        
        int[][] arr=new int[no_of_problems][3];
        for(int i=0;i<no_of_problems;i++){
                String guess=sc.nextLine();
                String[] string=guess.split(" ");
                arr[i][0]=Integer.valueOf(string[0]);
                arr[i][1]=Integer.valueOf(string[1]);
                arr[i][2]=Integer.valueOf(string[2]);
   
        }
        int count=0;
        for(int i=0;i<no_of_problems;i++){
            if(arr[i][0]+arr[i][1]+arr[i][2] >1){
                count++;
            }
        }
        System.out.println(count);

    }
    
}
