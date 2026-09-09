package Java_Basics;
import java.util.*;
public class PetyaAndString {
    public static int compareStrings(String str1,String str2){
        int len=str1.length();
        for(int i=0;i<len;i++){
            int curr1=str1.charAt(i);
            int curr2=str2.charAt(i);

            if(curr1<curr2){
                return -1;
            }else if(curr1>curr2){
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=(sc.next()).toLowerCase();
        String str2=(sc.next()).toLowerCase();
        sc.close();

        System.out.println(compareStrings(str1,str2));

    }
}
