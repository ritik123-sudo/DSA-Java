package Java_Basics;

import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();

        for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++){
                if(i<=row/2){
                    if(j<=i||j>=row-(i-1)){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }else{
                    if(j<=row-(i-1)||j>=i){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
             
            }
            System.out.println();
        }
    }
}
