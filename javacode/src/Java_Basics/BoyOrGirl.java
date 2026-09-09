package Java_Basics;
import java.util.*;
public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Set<Character> set=new HashSet<>();

        String s=sc.next();
        for(char c : s.toCharArray()){
            if(!set.contains(c)){
                set.add(c);
            }
        }

        if(set.size()%2==0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }
    }
}
