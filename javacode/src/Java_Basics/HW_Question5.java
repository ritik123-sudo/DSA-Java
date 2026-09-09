package Java_Basics;

import java.util.Scanner;

public class HW_Question5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int number;
        do{
            
            int Marks=sc.nextInt();
            if(Marks>=90){
                System.out.println("This is Good");
            }else if(Marks>=60){
                System.out.println("This is also Good.");
            }else{
                System.out.println("This is Good as well.");
            }  
            number=sc.nextInt();   
        }while(number!=0);
    }
}
