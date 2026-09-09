package Java_Basics;

import java.util.Scanner;

public class HW_Question10 {
    public static void main(String[] args) {
        // // Take an array of names as input from the user and print them on the screen.
        // Scanner sc=new Scanner(System.in);
        // int size=sc.nextInt();

        // String arr[]=new String[size];
        // // Input
        // for(int i=0;i<size;i++){
        //     arr[i]=sc.next();
        // }

        // // Output
        // for(int i=0;i<size;i++){
        //     System.out.print(arr[i]+" ");
        // }


        // // Find the maximum & minimum number in an array of integers. 
        // int minimum=Integer.MAX_VALUE;
        // int maximum=Integer.MIN_VALUE;

        // Scanner sc=new Scanner(System.in);
        // int size=sc.nextInt();
        // int arr[]=new int[size];
        // for(int i=0;i<size;i++){
        //     arr[i]=sc.nextInt();
        // }

        // // Search
        // for(int i=0;i<size;i++){
        //     if(arr[i]<minimum){
        //         minimum=arr[i];
        //     }
        //     if(arr[i]>maximum){
        //         maximum=arr[i];
        //     }
        // }
        // System.out.println("Maximum Value : "+maximum);
        // System.out.println("Minimum Value : "+minimum);


        // Take an array of numbers as input and check if it is an array sorted in ascending order.
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        // checking of ascending or not
        int prev=arr[0];
        for(int i=0;i<size;i++){
            if(arr[i]<prev){
                System.out.println("Not in ascending");
                return;
            }
            prev=arr[i];
        }
        System.out.println("Ascending order");




    }
}
