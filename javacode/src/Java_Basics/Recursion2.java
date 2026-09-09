package Java_Basics;

import java.util.HashSet;
import java.util.Set;

public class Recursion2 {
    // reverse string
    public static String ReverseString(String str,String empty_str,int idx){
        if(idx==0){
            empty_str+=str.charAt(idx);
            return empty_str;
        }
        empty_str+=str.charAt(idx);
        return ReverseString(str, empty_str, idx-1);
        
    }
    static int first=-1;
    static int last=-1;

    // First and last Occurence of an element
    public static void Question2(char element,int idx,String str){

        if(idx==str.length()){
            System.out.println("First Occurance : "+first);
            System.out.println("Last Occurance : "+last);
            return;
        }
        
        
        if(str.charAt(idx)==element){
            if(first==-1){
                first=idx;
            }
            last=idx;
        }
        Question2(element, idx+1, str);
    }

    // Check if array is strictly increasing or not
    public static boolean checkSorted(int[] arr,int idx){
        if(arr.length<=1){
            return true;
        }

        if(idx==arr.length){
            return true;
        }

        if(arr[idx]>arr[idx-1]){
            return checkSorted(arr, idx+1);
        }else{
            return false;
        }
    }

    // move x to the end of string
    public static StringBuilder moveToEnd(String str){
        StringBuilder sb =new StringBuilder();
        int idx=0;
        for(char ch :str.toCharArray()){
            
            if(ch!='x'){
                sb.insert(idx,ch);
                idx++;
            }else{
                sb.append('x');
            }
        }
        return sb;
    }

    // remove duplicates in a string
    public static StringBuilder removeDuplicates(Set set,String s,int idx,StringBuilder sb){
        if(idx==s.length()){
            return sb;
        }
        if(!set.contains(s.charAt(idx))){
            set.add(s.charAt(idx));
            sb.append(s.charAt(idx));
        }
        return removeDuplicates(set, s, idx+1, sb);
    }

    public static boolean[] map=new boolean[26];

    public static String removeDuplicates2(String s,String newString,int idx){
        if(idx==s.length()){
            return newString;
        }
        char currChar=s.charAt(idx);
         int pos=currChar-'a';
        if(map[pos]==false){
            newString+=currChar;
           
            map[pos]=true;
        }
        return removeDuplicates2(s, newString, idx+1);
    }

    // Print all subsequences of a String
    public static void printSubsequence(String s,int idx,String newString){
        if(idx==s.length()){
            System.out.print(newString+" ");
            return;
        }
        char currChar=s.charAt(idx);

        // with new character
        printSubsequence(s, idx+1, newString+currChar);

        // without new character
        printSubsequence(s, idx+1, newString);
    }
        // Print all unique subsequences of a String
    public static void printUniqueSubsequence(String s,int idx,String newString,HashSet <String> set){
        if(idx==s.length()){
            if(!set.contains(newString)){
                System.out.print(newString+" ");
                set.add(newString);
            }
            
            return;
        }
        char currChar=s.charAt(idx);

        // with new character
        printUniqueSubsequence(s, idx+1, newString+currChar,set);

        // without new character
        printUniqueSubsequence(s, idx+1, newString,set);
    }


    public static String keypad[]={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printComb(String number,int idx,String Combination){
        if(idx==number.length()){
            System.out.println(Combination);
            return;
        }
        char currChar=number.charAt(idx);
        String mapping=keypad[currChar-'0'];
        for(int i=0;i<mapping.length();i++){
            printComb(number, idx+1,Combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        // System.out.println(ReverseString("Ritik","",4));
        // Question2('a', 0, "abaacdaefaah");
        // int arr[]={1,4,3,4,5};
        // System.out.println(checkSorted(arr, 1));
        // String str="axbcxxd";
        // System.out.println(moveToEnd(str));
        // Set <Character> set=new HashSet<>();
        // StringBuilder sb=new StringBuilder();
        // System.out.println(removeDuplicates(set, "abbcdaxyzcbfasefjl", 0,sb));

        // System.out.println(removeDuplicates2("aaaabcdfgttttr", "", 0));
        // printSubsequence("abc", 0, "");

        // HashSet <String> set=new HashSet<>();
        // printUniqueSubsequence("aaaa",0,"",set);
        printComb("23", 0, "");


    }
    
}
