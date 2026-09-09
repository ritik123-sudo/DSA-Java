package Java_Basics;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int number=1;
        for(int i=1;i<=2*row;i++){

            // 1st Part
            if(i<=row){
                // print spaces
                for(int j=1;j<=row-i;j++){
                    System.out.print(" ");
                }
                // print stars
                for(int j=1;j<=2*(i-1)+1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }

            // 2nd Part
            else{
                // print spaces
                for(int j=1;j<=i-(row+1);j++){
                    System.out.print(" ");
                }
                
                for(int j=1;j<=row*2-number;j++){
                    System.out.print("*");
                    
                }
                number=number+2;
                System.out.println();
            }
        }
    }
}

