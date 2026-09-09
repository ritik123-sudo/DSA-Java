package Java_Basics;

import java.util.Scanner;

public class HalfPyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();

        // for(int i=1;i<=row;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // // Inverted Half Pyramid
        // for(int i=row;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // // Inverted Half Pyramid(rotated by 180 degree)
        // for(int i=1;i<=row;i++){
        //     for(int j=0;j<row;j++){
        //         if(j>=row-i){
        //             System.out.print("* ");
        //         }else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=row;i++){
        //     int number=1;
        //     for(int j=1;j<=i;j++){
        //         System.out.print(number+" ");
        //         number++;
        //     }
        //     System.out.println();
        // }

        // for(int i=row;i>=1;i--){
        //     int number=1;
        //     for(int j=1;j<=i;j++){
        //         System.out.print(number+" ");
        //         number++;
        //     }
        //     System.out.println();
        // }

        // // Floyeds Triangle
        // int number=1;
        // for(int i=1;i<=row;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(number+" ");
        //         number++;
        //     }
        //     System.out.println();
        // }
        // number=1;
        // for(int i=1;i<=row;i++){
        //     for(int j=1;j<=i;j++){
                
        //         System.out.print(number);
        //         if(number==1){
        //             number=0;
        //         }else{
        //             number=1;
        //         }
        //     }
        //     System.out.println();
        // }


        // A Rhombus
        for(int i=1;i<=row;i++){
            int starsprinted=0;
            for(int j=1;j<2*row;j++){
                if(j>row-i&&starsprinted<row){
                    System.out.print("* ");
                    starsprinted++;
                }else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }

        // Number Pyramid
        for(int i=1;i<=row;i++){
            for(int j=1;)
        }
    }
}
