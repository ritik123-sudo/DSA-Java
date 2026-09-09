package Java_Basics;

public class AdvancerRecursion {
    // Print all permutation of a string
    public static void printPerm(String str,String perm){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currChar=str.charAt(i);
            String newString=str.substring(0,i)+str.substring(i+1);
        
            printPerm(newString, perm+currChar);
        }
    }

    // total paths in a maze from (0,0) to (n,m)
    public static int countPaths(int rows,int column,int count,int i,int j){
        if(i==rows-1&&j==column-1){
            count++;
            return count;
        }
        if(i==rows-1 ){
            return countPaths(rows, column, count, i, j+1);
        }else if(j==column-1){
            return countPaths(rows, column, count, i+1, j);
        }else
        return countPaths(rows, column, count,i+1,j)+countPaths(rows, column, count,i,j+1);
    }

    // count in ways tiles can be placed of size 1*m
    public static int countTilesWays(int n,int m,int noOfTiles){
        if(noOfTiles<0){
            return 0;
        }
        if(noOfTiles==0){
            return 1;
        }
        // vertical placement
        int verticalWays=countTilesWays(n, m, noOfTiles-m);

        // horizontal placement
        int horizontalWays=countTilesWays(n, m, noOfTiles-1);
        return verticalWays+horizontalWays;
    }

        // count in ways tiles can be placed of size 1*m
    public static int countTilesWays2(int n,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        // vertical placement
        int verticalWays=countTilesWays2(n-m, m);

        // horizontal placement
        int horizontalWays=countTilesWays2(n-1, m);
        return verticalWays+horizontalWays;
    }

    // call guests in n ways
    public static int callGuests(int n){
        
        if(n<=1){
            return 1;
        }
        // single ways
        int ways1=callGuests(n-1);

        // pair ways
        int ways2=(n-1)*callGuests(n-2);

        return ways1+ways2;
    }
    // print subsets of first n natural numbers;
    public static void printSubsets(int i,String newString,int n){
        if (i>n) {
            System.out.println(newString);
            return;
        }
        String currChar=i+"";
        // 1st Choice
        printSubsets(i+1, newString+currChar,n);

        // 2nd Choice
        printSubsets(i+1, newString,n);

        
    }
    public static void main(String[] args) {
        // printPerm("abc", "");
        // System.out.println(countPaths(3, 3, 0, 0, 0));
        // System.out.println(countTilesWays(4, 2, 4));
        // System.out.println(countTilesWays2(4,2));
        // System.out.println(callGuests(4));
        printSubsets(1, "",3);
    }
}
