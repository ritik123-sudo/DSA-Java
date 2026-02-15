import java.util.Scanner;

public class Compare_Strings {
    public static int compare_strings(String f,String s){
        for(int i=0;i<f.length();i++){
            if(f.charAt(i)<s.charAt(i)){
                return -1;
            }
            if(s.charAt(i)<f.charAt(i)){
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String firstString=sc.nextLine();
        String secondString=sc.nextLine();

        String f=firstString.toLowerCase();
        String s=secondString.toLowerCase();

        System.out.println(compare_strings(f, s));
    }
    
}
