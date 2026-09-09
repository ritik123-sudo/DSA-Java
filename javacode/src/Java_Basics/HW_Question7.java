package Java_Basics;

import java.util.Scanner;

public class HW_Question7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int number=1;
        for(int i=1;i<=row;i++){
            for(int j=1;j<2*row;j++){
                if(row%2!=0){
                    if(i%2!=0){
                        if((j>=row-(i-1)&&j<=row+(i-1))&&(j%2!=0)){
                            System.out.print(number+" ");
                        }else{
                            System.out.print("  ");
                        }
                    }else{
                        if((j>=row-(i-1)&&j<=row+(i-1))&&(j%2==0)){
                            System.out.print(number+" ");
                        }else{
                            System.out.print("  ");
                        }
                    }
                
                    
                }else{
                        if(i%2!=0){
                            if((j>=row-(i-1)&&j<=row+(i-1))&&(j%2==0)){
                                System.out.print(number+" ");
                            }else{
                                System.out.print("  ");
                            }
                        }else{
                            if((j>=row-(i-1)&&j<=row+(i-1))&&(j%2!=0)){
                                System.out.print(number+" ");
                            }else{
                                System.out.print("  ");
                            }
                        }     
                }
             
            }
            number++;
            System.out.println();
        }
    }
}
