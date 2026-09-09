package Java_Basics;

import java.util.Scanner;

public class HW_Question8 {
    static int numbermodification(int number,int j,int row){
        if(j<row){
            number--;
        }else {
            number++;
        }
        return number;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int number;
        for(int i=1;i<=row;i++){
            number=i;
            for(int j=1;j<2*row;j++){
                if(j>=row-(i-1)&&j<=row+(i-1)){
                    System.out.print(number+" ");
                    number=numbermodification(number,j,row);
                    
                }else{
                    System.out.print("  ");
                    // number=numbermodification(number,j,row);
                }
                
            }
            System.out.println();
        }
    }
}
