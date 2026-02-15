import java.util.Scanner;

public class String_task {
    public static boolean is_vowel(Character ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='y'){
            return true;
        }else{
            return false;
        }
    }
    public static String convertedString(String s ,String newString){
        String lowercaseString=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            Character currChar=lowercaseString.charAt(i);
            if(is_vowel(currChar)){
                continue;
            }else{
                newString=newString+".";
                newString=newString+currChar;
            }
        }
        return newString;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(convertedString(s,""));
    }
    
    
    
}
