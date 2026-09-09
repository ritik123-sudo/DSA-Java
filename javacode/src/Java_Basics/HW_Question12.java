package Java_Basics;
// For a given matrix of N x M, print its transpose.

import java.util.Scanner;

public class HW_Question12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int column=sc.nextInt();

        int[][] arr=new int[row][column];
        int arrTranspose[][]=new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arrTranspose[j][i]=arr[i][j];
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(arrTranspose[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
