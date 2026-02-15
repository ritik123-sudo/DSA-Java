package DSA;

import java.util.HashSet;

public class RecursionYT2 {
    //Tower of Hanoi
    public static void toh(int n,String src,String helper,String dest){
        if(n==1){
            System.out.println("Transfer disc "+n+" from "+src+" to "+dest);
            return;
        }
        toh(n-1,src,dest,helper);
        System.out.println("Transfer disc "+n+" from "+src+" to "+dest);
        toh(n-1,helper,src,dest);
        
    }

    //Reverse String
    public static void reverseString(String s,int lastindex){
        if(lastindex==0){
            System.out.print(s.charAt(lastindex));
            return;
        }
        System.out.print(s.charAt(lastindex));
        reverseString(s, lastindex-1);
        
    }
    public static int first=-1;
    public static int last=-1;
    //First and last occurence of String
    public static void first_last_occurence(String s,char target,int i){
        if(i==s.length()){
            System.out.println("First Index : "+first);
            System.out.println("Last Index :"+last);
            return;
        }
        if(s.charAt(i)==target){
            if(first==-1){
                first=i;
                last=i;
            }else{
                last=i;
            }
            
        }
        first_last_occurence(s, target, i+1);
    }
    //Check if array is sorted
    //public static int i=0;
    public static boolean checksort(int[] arr,int i){
        if(i==arr.length-1 ){
            return true;
        }
        if(arr[i]<arr[i+1]){
            return checksort(arr, i+1);
        }else{
            return false;
        }
        
        

    }

    //Move all x to end of the string
    public static int count=0;
    public static void move_x_to_end(String s,int idx,char target){
        if(idx==s.length()){
        for(int i=0;i<count;i++){
            System.out.print(target);
        }
            return;
        }
        if(s.charAt(idx)==target){
            count++;
        }else{
            System.out.print(s.charAt(idx));
        }
        move_x_to_end(s, idx+1, target);
        

    }

    //remove duplicates
    public static boolean[] map=new boolean[26];

    public static void remove_duplicates(String s,int idx,String newString){
        if(idx==s.length()){
            System.out.println(newString);
            return;
        }
        boolean result=map[s.charAt(idx)-'a'];
        if(!result){
            newString=newString+s.charAt(idx);
            map[s.charAt(idx)-'a']=true;
        }
        remove_duplicates(s, idx+1, newString);
    }

    //subsequences in a string
    public static void subsequences(String s,int idx,String newString){
        if(idx==s.length()){
            System.out.println(newString);
            return;
        }
        char currChar=s.charAt(idx);
        String without=newString;
        String with=newString+currChar;
   
        subsequences(s, idx+1, with);
        subsequences(s, idx+1, without);
    }

    // set of unique subsequences in a string
        public static void uniquesubsequences(String s,int idx,String newString,HashSet<String> set){
        if(idx==s.length()){
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
            
        }
        char currChar=s.charAt(idx);
        String without=newString;
        String with=newString+currChar;
        uniquesubsequences(s, idx+1, with,set);
        uniquesubsequences(s, idx+1, without,set);
        
    }

    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printComb(String str,int idx,String combination){
        if(idx==str.length()){
            System.out.println(combination);
            return;
        }
        char currChar=str.charAt(idx);
        String mapping=keypad[currChar-'0'];
        for(int i=0;i<mapping.length();i++){
            printComb(str, idx+1, combination+mapping.charAt(i));
        }
    }

        public static void main(String[] args){
        // int n=3;
        // toh(n,"A","B","C");

        // reverseString("Madarchod",8);
        // first_last_occurence("Ritik", 'i', 0);
        // int[] arr={1,2,3,4,5};
        // System.out.println(checksort(arr, 0));
        // String s="axbcxxd";
        // move_x_to_end(s, 0,'x' );
        // String newString="";
        // String s="aaa";
        // // remove_duplicates(s, 0, newString);
        // HashSet<String> set=new HashSet<>();
        // uniquesubsequences(s, 0,newString, set);
        printComb("23", 0, "");
    }
    
}
