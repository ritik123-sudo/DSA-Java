package DSA;
import java.util.*;
public class BlockSwapPla {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the count of numbers to be swapped: ");
        ArrayList <Integer> list=new ArrayList<>();
        int k=sc.nextInt();
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        k=k%n;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.nextLine();
        System.out.println("Enter 'r' for right rotation & 'l' for left rotation: ");
        String ch=sc.nextLine();
        if(ch.equals("r")){
            for(int i=0;i<n;i++){
                    if(i<k){
                        list.add(arr[n-k+i]);
                    }
                    else{
                        list.add(arr[i-k]);
                    }
                }
        }
        else{
            for(int i=0;i<n;i++){
                    list.add(arr[(k+i)%n]);
                }
        }
        /*int s=sc.nextInt();
        switch(s){
            case 1:
            {
                for(int i=0;i<n;i++){
                    if(i<k){
                        list.add(arr[n-k+i]);
                    }
                    else{
                        list.add(arr[i-k]);
                    }
                }
                break;
            }
            case 2:
            {
                for(int i=0;i<n;i++){
                    list.add(arr[(k+i)%n]);
                }
                break;
            }
            default:
            System.out.println("Invalid");
            break;
        }*/
        System.out.println(list);
    }
    
}
