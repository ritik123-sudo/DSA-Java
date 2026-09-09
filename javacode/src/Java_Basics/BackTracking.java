package Java_Basics;

public class BackTracking {
    public static void printPerm(String s,String newString){
        if(s.length()==0){
            System.out.println(newString);
            return;
        }
        for(int i=0;i<s.length();i++){
            char currChar=s.charAt(i);
            String resulString=s.substring(0,i)+s.substring(i+1);
            printPerm(resulString, newString+currChar);
        }

            
        

    }
    public static void main(String[] args) {
        printPerm("ABC",  "");
    }
}
