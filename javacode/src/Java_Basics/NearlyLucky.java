package Java_Basics;

import java.util.Scanner;

public class NearlyLucky {
    public static boolean isLucky(int count){
        if (count==0) return false;
        while(count!=0){
            int rem=count%10;
            if(!(rem==4 || rem==7)){
                return false;
            }
            count/=10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long num=sc.nextLong();
        int count=0;
        
        while(num!=0){
          long rem=num%10;
            if(rem==4 || rem==7){
                count++;
            }
            num/=10;
        }
        if(isLucky(count)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}