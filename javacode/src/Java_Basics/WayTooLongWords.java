package Java_Basics;

import java.util.ArrayList;
import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        ArrayList<String> arr=new ArrayList<>(n);
        for(int i=1;i<=n;i++){
            arr.add(sc.next());
        }

        for(String s : arr){
            if(s.length()<=10){
                System.out.println(s);
            }else{
                System.out.println(s.charAt(0)+""+(s.length()-2)+""+s.charAt(s.length()-1));
            }
        }

        
    }
}
