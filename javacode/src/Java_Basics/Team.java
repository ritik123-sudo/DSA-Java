package Java_Basics;
import java.util.*;
public class Team {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count =0;
        sc.nextLine();
        for(int i=1;i<=n;i++){
            String s=sc.nextLine();
            String[] arr=s.split(" ");
            int sure=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j].equals("1")){
                    sure++;
                }
            }
            count=sure>=2? count+1 : count;
        }

        System.out.println(count);
    }
}
