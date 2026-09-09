package Java_Basics;

import java.util.Scanner;

public class checkPrime {
    public static boolean isPrime(int number){
        if(number==1){
            return false;
        }
        for(int i=2;i*i<=number;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean isEven(int number){
        if(number%2==0){
            return true;
        }else{
            return false;
        }
    }
    public static void printTable(int number){
        for(int i=1;i<=10;i++){
            System.out.println(number+" * "+i+" = "+(number*i));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        System.out.println(isPrime(number));

        System.out.println(isEven(number));

        printTable(number);
    }
    
}
