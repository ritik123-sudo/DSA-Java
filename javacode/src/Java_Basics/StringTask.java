package Java_Basics;
import java.util.*;
public class StringTask {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        sc.close();
        Set<Character> set=new HashSet<>();
        set.add('a');
        set.add('o');
        set.add('y');
        set.add('e');
        set.add('u');
        set.add('i');

        String result="";
        for(char c : s.toCharArray()){
            char currChar=Character.toLowerCase(c);
            if(!set.contains(currChar)){
                result=result+"."+currChar;
            }
        }
        System.out.println(result);
    }
}
