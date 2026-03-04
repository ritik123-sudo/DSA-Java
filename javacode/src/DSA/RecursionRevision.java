package DSA;
import java.util.*;
public class RecursionRevision {
    //Print numbers from n to 1(in reverse order till 1)
    public static void printnumb(int n){
        if(n==0){
        
            return;
        }
        System.out.println(n);
        printnumb(n-1);
        //System.out.println(n);
    }

    //Print number from 1 to n
    public static void printnumb2(int n){
        if(n==0){
            return;
        }
        printnumb2(n-1);
        System.out.println(n);
    }

    //Sum of first n natural numbers
    public static int sum_of_n_natural_number(int n){
        if(n==0){
            return 0;
        }
        return n+sum_of_n_natural_number(n-1);
    }
    public static void main(String []args){
        int n=6;
        //printnumb(n); //Print numbers from n to 1
        //printnumb2(n);

        System.out.println("Sum of natural number upto 100 : "+sum_of_n_natural_number(100));

    }
}
