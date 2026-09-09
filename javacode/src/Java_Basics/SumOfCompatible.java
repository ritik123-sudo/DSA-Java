package Java_Basics;
class Solution {
    public int sumOfGoodIntegers(int n, int k) {
        int sum=0;
        int x=1;
        while(Math.abs(n-x)<=k){
            if((n&x)==0){
                sum+=x;
            }
            x++;
        }
        return sum;
    }
}
public class SumOfCompatible{
    public static void main(String[] args) {
        System.out.println(sumOfGoodIntegers(2,3));
    }
}