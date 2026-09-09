package Java_Basics;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    public static void saveBoard(char[][] board,List<List<String>> allBoards){
        List<String> newBoard=new ArrayList<>();
        for(int i=0;i<board.length;i++){
            String row="";
            
            for(int j=0;j<board[0].length;j++ ){
                if(board[i][j]=='Q'){
                    row+='Q';
                }else{
                    row+='.';
                }
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }
    public static boolean isSafe(int row,int col,char[][] board){
        // Horizintal check
        for(int c=0;c<board.length;c++){
            if(board[row][c]=='Q'){
                return false; 
            }
        }
        // Vertical check
        for(int r=0;r<board.length;r++){
            if(board[r][col]=='Q'){
                return false; 
            }
        }
        // upper left
        int r=row;
        for(int c=col;c>=0&&r>=0;r--,c--){
            if(board[r][c]=='Q'){
                return false; 
            }
        }
        // upper right
        r=row;
        for(int c=col;c<board.length&&r>=0;r--,c++){
            if(board[r][c]=='Q'){
                return false; 
            }
        }
        // lower left
        r=row;
        for(int c=col;c>=0&&r<board.length;r++,c--){
            if(board[r][c]=='Q'){
                return false; 
            }
        }
        //lower right 
        r=row;
        for(int c=col;c<board.length&&r<board.length;r++,c++){
            if(board[r][c]=='Q'){
                return false; 
            }
        }
        return true;
    }
    public static void helper(char[][] board,List<List<String>> allBoards,int col){
        if(col==board.length){
            saveBoard(board,allBoards);
            return;
        }
        for(int row=0;row<board.length;row++){
            if(isSafe(row,col,board)){
                board[row][col]='Q';
                helper(board, allBoards, col+1);
                board[row][col]='.';
            }
        }
    }
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards=new ArrayList<>();
        char[][] board=new char[n][n];
        helper(board, allBoards, 0);
        return allBoards;
        
        
    }
    public static void main(String[] args) {
        // List<List<String>> allBoards=new ArrayList<>();
        int n=4;
        
        System.out.println(solveNQueens( 4));

    }
    
}
