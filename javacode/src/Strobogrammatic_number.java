import java.util.*;
public class Strobogrammatic_number {
    public static void main(String[] args){
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,0);
        map.put(1,1);
        map.put(6,9);
        map.put(8,8);
        map.put(9,6);

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of elements in Number :");
        int n=sc.nextInt();

        int []number=new int[n];
        System.out.println("Enter the Number :  ");
        for(int i=0;i<n;i++){
            number[i]=sc.nextInt();
        }

        if(isstrobogrammatic(number,map)==true){
                System.out.println("Number is valid. ");

        }
        else{
            System.out.println("Number is not valid.");
        }

        sc.close();



    } 
    public static boolean isstrobogrammatic(int []number,HashMap<Integer, Integer> map){
        int i=0;
        int j=number.length-1;
        while(i<=j){
            if(!map.containsKey(number[i])||!map.containsKey(number[j])){
                return false;
            }
            if(number[i]!=map.get(number[j])){
                return false;
            }
            j--;
            i++;
            
        }
        return true;
        
    }

}
