package Java_Basics;
import java.util.*;
public class NextRound {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        String input=sc.nextLine();
        String arr[]=input.split(" ");

        String s=sc.nextLine();
        String scores[]=s.split(" ");

        int cutoff=Integer.parseInt(scores[Integer.parseInt(arr[1])-1]);
    
        for(int i=0;i<scores.length;i++){
            int curr=Integer.parseInt(scores[i]);
            if(curr>=cutoff&&curr>0){
                count++;
            }
        }
        System.out.println(count);
    }

}
