package Java_Basics;
class Solution5 {
    public boolean isPerfectSquare(int num) {
        double idx=1;
        while(!(idx>(num/idx))){
            if(idx==(double)(num/idx)){
                return true;
            }
            idx++;
        }
        return false;
    }
}
class Solution6 {
    public boolean isHappy(int n) {
        if(n==1){
            return true;
        }
        if(n<=9){
            return false;
        }
        int newnum=0;
        while(n!=0){
            int rem=n%10;
            newnum+=rem*rem;
            n=n/10;
        }
        return isHappy(newnum);
    }
}
class Solution7 {
    public int[] plusOne(int[] digits) {
        int num=0;
        for(int i=digits.length-1;i>=0;i--){
            num=10*num+digits[i];
        }
        num++;
        int []result=new int[(num+"").length()];
        int idx=(num+"").length()-1;
        while(num!=0){
            int rem=num%10;
            result[idx--]=rem;
            num/=10;
        }
        return result;
    }
}
class Solution8 {
    public int[] plusOne(int[] digits) {
        boolean isSorted=false;
        int carry=0;
        int idx=0;
        while(!(carry==0 && isSorted==true)){
            int curr=digits[digits.length-1-idx];
            if(carry==1){
                if(curr==9){
                    curr=0;
                    carry=1;
                }else{
                    curr++;
                    isSorted=true;
                    carry=0;
                }
            }else{
                if(curr==9){
                    curr=0;
                    carry=1;
                }else{
                    curr++;
                    carry=0;
                    isSorted=true;
                }
                
            }
            digits[digits.length-1-idx]=curr;
            idx++;
            if(idx==digits.length-1&& curr==0){
                int[] results=new int[digits.length+1];
                results[0]=carry;
                for(int i=0;i<digits.length;i++){
                    results[i+1]=digits[i];
                }
                return results;
            }
            
        }
        return digits;
    }
}
class Solution9 {
    public int titleToNumber(String columnTitle) {
        // String s=columnTitle.toLowerCase();
        int result=0;
        // int prev=0;
        for(int i=columnTitle.length()-1;i>=0;i--){
            // result=result+26*prev;
            int curr=columnTitle.charAt(i)-'0'-16;
            result=result*26+curr;
            // prev=curr;
        }
        return result;
    }
}
class Solution10 {
    public int findNthDigit(int n) {
        // if(n<=9){
        //     return n;
        // }
        int digit=1;
        for(int i=1;i<=n;i++){
            int temp=i;
            int pow=(int)Math.pow(10,(i+"").length()-1);
            while(temp!=0){
                if(digit==n){
                    return temp/pow;
                }
                temp=temp%pow;
                pow/=10;
                digit++;
            }
        }
        return digit;
        
    }
}

public class PerfectSquare {
    public static void main(String[] args) {
        // Solution5 s=new Solution5();
        // System.out.println(s.isPerfectSquare(5));

        // Solution6 s=new Solution6();
        // System.out.println(s.isHappy(19));
        // Solution7 s=new Solution7();
        // int[] digits={4,3,2,1};
        // int[]arr=s.plusOne(digits);
        // Solution9 s=new Solution9();
        // // int[] arr={9,9};
        // // int ar[]=s.plusOne(arr);
        // // char l='B';
        // // int r=l-'0';
        // // System.out.println(r);
        // System.out.println(s.titleToNumber("AB"));
        Solution10 s=new Solution10();
        System.out.println(s.findNthDigit(11));
    }
    
    
}
