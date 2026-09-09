package Java_Basics;

import java.util.Scanner;

public class HW_Question13 {
    //Input a string and replace e with i
    public static String Question2(String str){
        String result="";
        for(int i=0;i<str.length();i++){
            char letter=str.charAt(i);
            if(letter=='e'){
                result+='i';

            }else{
                result+=letter;
            }
        }
        return result;

    }


    // Make Username
    public static String Make_Username(String email_id){
        String username="";
        for(int i=0;i<email_id.length();i++){
            char letter=email_id.charAt(i);
            if(letter=='@'){
                return username;
            }else{
                username+=letter;
            }
        }
        return username;
    }
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Enter Length of Array : ");
        // int length=sc.nextInt();
        // String arr[]=new String[length];

        // int cummulative=0;
        // for(int i=0;i<length;i++){
        //     String input=sc.next();
        //     arr[i]=input;
        //     cummulative=cummulative+input.length();
        // }
        // System.out.println("Total Length of array : "+cummulative);

        // System.out.println(Question2("eabcdef"));
        System.out.println(Make_Username("helloWorld123@gmail.com"));
    }
}
