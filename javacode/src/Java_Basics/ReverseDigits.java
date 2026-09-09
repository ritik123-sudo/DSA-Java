package Java_Basics;

public class ReverseDigits {
    
    public static  int myAtoi(String s) {
        int num=0;
        int i=0;

        
        
        for(char ch:s.toCharArray()){

            if(ch==' '&&i==0){
                continue;
            }
            else if(ch=='-'&&i==0){
                num=-num;
                
                
            }else if(ch=='+'&&i==0){
                num=num;
                
            }
            else if((ch-'0')<0 || (ch-'0')>9){
                break;
            }else{
                int digit=ch-'0';
                if(num>Integer.MAX_VALUE/10){
                    num= Integer.MAX_VALUE;
                    break;
                }else if(num<Integer.MIN_VALUE/10){
                    num= Integer.MIN_VALUE;
                    break;
                }
                num=num*10+digit;
            }
            i++;
        }
        
        return num;
    }

    // isPalindrome
    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int reversedString=0;
        int n=x;
        
        while(n!=0){
            int rem=n%10;
            reversedString=reversedString*10+rem;
            n=n/10;
        }
        return reversedString==x;
    }

    public static void main(String[] args) {
        // int x=-1232;
        
        // int reversedNumber=0;
        
        // while(x!=0){
        //     reversedNumber=x%10+reversedNumber;
            
        //     x=x/10;
        //     if(x!=0){
        //       reversedNumber*=10;
        //     }
        // }
        // System.out.println(reversedNumber);
        // char ch='a';
        // System.out.println(ch-'9');
        System.out.println(myAtoi("-042"));

    }
    
    
}
