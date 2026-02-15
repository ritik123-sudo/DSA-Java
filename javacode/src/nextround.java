import java.util.*;
public class nextround {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String no_of_contestants_and_cutoff=sc.nextLine();
        String[] s=no_of_contestants_and_cutoff.split(" ");
        int no_of_contestants=Integer.parseInt(s[0]);
        int last_qualified_contestant_rank=Integer.valueOf(s[1]);

        

        String score=sc.nextLine();
        String[] score_array=score.split(" ");
        int count=0;
        for(int i=0;i<no_of_contestants;i++){
            
            int current_contestant_score=Integer.valueOf(score_array[i]);
            if(current_contestant_score<Integer.parseInt(score_array[last_qualified_contestant_rank-1])){
                
                break;
            }
            if(current_contestant_score<=0){
                break;
            }
            count++;
            
        }
        System.out.println(count);

    }
    
}
