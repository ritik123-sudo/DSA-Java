package Java_Basics;

import java.util.Scanner;

public class HW_Question6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        for(i=2;i*i<=n;i++){
            if(n%i==0){
                System.out.println("Not a prime ");
                break;
            }
        }
        if(n==1){
            System.out.println("Not a Prime");
        }
        else if(i*i>n){
            System.out.println("Prime Number");
        }
    }
}
