package DSA;
import java.util.*;
public class Day2VariablesInJava {
    public static void print_star(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // System.out.println("Hello World"); 
        // print_star(5);

        // Variables
    //     int a=10;
    //     int b=25;
    //     int sum=a+b;
    //     System.out.println(sum);

    //     int diff=b-a;
    //     System.out.println(diff);

        Scanner sc=new Scanner(System.in);
    //     String name=sc.nextLine();
    //     System.out.println(name);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("Sum of "+ a + " and "+ b +" is "+sum);
    }
}
