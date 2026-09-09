package Java_Basics;
// Sum of first n natural numbers.
public class Question4 {
    public static void main(String[] args) {
        int n=14;
        int sum=0;
        while(n>0){
            sum=sum+n;
            n--;
        }
        System.out.println(sum);
    }
}
