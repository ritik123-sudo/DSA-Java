package Java_Basics;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int column=sc.nextInt();
        int[][]arr=new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.print("Enter Number You Want to Search : ");
        int x=sc.nextInt();

         for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(arr[i][j]==x){
                    System.out.println("Row is "+(i+1));
                    System.out.println("Column is "+(j+1));
                }
            }
        }
    }
}
