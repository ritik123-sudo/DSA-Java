package DSA;

import java.util.ArrayList;
import java.util.List;

public class RecursionYT3 {
    public static void printPerm(String str,String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;

        }

        for(int i =0;i<str.length();i++){
            char currChar=str.charAt(i);
            String newstr=str.substring(0, i)+str.substring(i+1);
            printPerm(newstr,permutation+currChar);
        }
    }

    //no. of paths in maze from 0,0 to n,m
    public static int countPaths(int i,int j,int n,int m){
        if(i==n||j==m){
            return 0;
        }
        if(i==n-1&&j==m-1){
            return 1;
        }

        return countPaths(i+1, j, n, m)+countPaths(i, j+1, n, m);
    }

    //Place Tiles of size 1*m in floor of size n*m
    public static int placeTiles(int n,int m){
        if(n==m){
            return 2;
        }
        if(n<m){ 
            return 1;
        }
        int vertical=placeTiles(n-m, m);
        int horizontal=placeTiles(n-1, m);
        return vertical+horizontal;
    }
    
    //number of ways to call guests in party
    public static int callguests(int guests){
        if(guests<0){
            return 0;
        }
        if(guests==0){
            return 1;
        }
        int single=callguests(guests-1);
        int pair=(guests-1)*callguests(guests-2);
        return single+pair;
    }

    //Subset of set of first n natural numbers
    public static List<List<Integer>> result=new ArrayList<>();
    
    public static void subsets(List<Integer> set,List<Integer> subset,int i){
        if(i==set.size()){
            
            System.out.println(subset);
            return;
        }
            
                int currChar=set.get(i);
                List<Integer> with=new ArrayList<>(subset);
                with.add(currChar);

            
                subsets(set,with,i+1);
                //without
                subsets(set,subset,i+1);

    }

    public static void main(String[] args){
        //printPerm("abc","");
        // System.out.println(callguests(4));
        List<Integer> set=new ArrayList<>();
        set.add(1);
        set.add(2);
        set.add(3);
        List<Integer> subset=new ArrayList<>();
        subsets(set, subset,0);
    }
    
}
