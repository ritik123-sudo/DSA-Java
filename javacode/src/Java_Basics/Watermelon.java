package Java_Basics;

import java.util.Scanner;

public class Watermelon {
    public static void watermelon(int w){
        if(w==2||w%2!=0){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt();
        watermelon(w);
    }
}
