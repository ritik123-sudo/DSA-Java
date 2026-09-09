package Java_Basics;
import java.util.*;
public class LinkedListQuestion {
    // Question1 : Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). 
    // Search for the number 7 & display its index.
    public static int Question1(int data,int[] nums){
        LinkedList<Integer> list=new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        int idx=0;
        // search for number
        for(int num : list){
            if(num==data){
                return idx;
            }
            idx++;
        }
        return -1;
        }

        // Question 2 Take elements(numbers in the range of 1-50) of a Linked List as input
        // from the user. Delete all nodes which have values greater than 25.
        public static void Question2(){
            LinkedList<Integer> list =new LinkedList<>();
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            System.out.println("Enter Value From 1-50");
            for(int i=1;i<=n;i++){
                list.add(sc.nextInt());
            }
            int idx=0;
            Iterator<Integer> it =list.iterator();
            while(it.hasNext()){
                if(it.next()>25){
                it.remove();
                }
            }
            System.out.println(list);
        }
            
    public static void main(String[] args) {
        int nums[]={1, 5, 7, 3 , 8, 2, 3};
        // System.out.println(Question1(7,nums));
        Question2();
    }

}
