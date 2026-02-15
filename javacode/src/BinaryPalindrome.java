public class BinaryPalindrome {
    public static boolean binary_palindrome(String bin){
        int l=0;
        int r=bin.length()-1;
        while(l<r){
            if(bin.charAt(l)!=bin.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args){
        int num=9;
        String bin=Integer.toBinaryString(num);
        System.out.println(binary_palindrome(bin));


    }
    

    
}
