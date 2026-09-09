package Java_Basics;

import java.util.Scanner;

public class SpiralPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int[][] arr = new int[row][column];

        for (int i = 0; i < row; i++)
            for (int j = 0; j < column; j++)
                arr[i][j] = sc.nextInt();

        int row_start = 0, row_end = row - 1;
        int column_start = 0, column_end = column - 1;
        int i = 0, j = 0;

        int calculateInternalRow = row;
        int calculateInternalColumn = column;
        int number = 2 * (calculateInternalRow + calculateInternalColumn) - 4;

        for (int k = 1; k <= (row * column); k++) {
            System.out.print(arr[i][j] + " ");

            if      (i == row_start    && j != column_end)  j++;
            else if (j == column_end   && i != row_end)     i++;
            else if (i == row_end      && j != column_start) j--;
            else if (j == column_start && i != row_start)   i--;

            number--;

            if (number == 0) {
                row_start++;
                column_start++;
                row_end--;
                column_end--;

                
                i = row_start;
                j = column_start;

                calculateInternalRow -= 2;
                calculateInternalColumn -= 2;
                

                if (calculateInternalRow == 1) {
                    number = calculateInternalColumn;
                } else if (calculateInternalColumn == 1) {
                    number = calculateInternalRow;
                } else {
                    number = 2 * (calculateInternalRow + calculateInternalColumn) - 4;
                }
                
            }
        }
        
    }
}