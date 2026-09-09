package Java_Basics;

import java.util.Scanner;

public class Array_Question {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Size of Array : ");
        int size=sc.nextInt();

        int arr[]=new int[size];

        for(int i=0;i<size;i++){
            System.out.print("Enter Array Element : ");
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.print("\nEnter Number You Want to Search : ");
        int x=sc.nextInt();

        for(int i=0;i<size;i++){
            if(arr[i]==x){
                System.out.println("Index Number : "+i);
            }
        }
        
    }
}
