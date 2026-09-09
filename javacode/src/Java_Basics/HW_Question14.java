
package Java_Basics;
public class HW_Question14 {
    // 2.    Write a program to toggle a bit a position = “pos” in a number “n”.
    public static int toggleBit(int number,int pos){
        int BitMask=1<<pos;
        return number^BitMask;
    }

    // 3.    Write a program to count the number of 1’s in a binary representation of the number.
    public static int countLength(int n){
        String str=Integer.toBinaryString(n);
        int bin=Integer.parseInt(str);
        int count=0;
        while(bin!=0){
            int rem=bin%10;
            if(rem==1){
                count++;
            }
            bin=bin/10;
        }
        return count;
    }

    public static int bitCount1(int number){
        int count=0;
        while(number!=0){
            count+=number&1;
            number=number>>1;
        }
        return count;
        
    }

    public static void decimalToBinary(int dec){
        String str="";
        while(dec!=0){
            str=(dec&1)+str;
            dec=dec>>1;
        }
        System.out.println(str);
    }

    public static void binaryToDecimal(int number){
        int num=number;
        System.out.println(num);
    }

    public static void binaryToDecimal2(int number){

    int power = 0;
    int decimal = 0;

    while(number != 0){

        int lastDigit = number % 10;

        decimal += lastDigit * (1 << power);

        power++;
        number = number / 10;
    }

    System.out.println(decimal);
}
    public static void main(String[] args) {
        // int n=1024;
        // if((n&(n-1))==0 && n>0){
        //     System.out.println("Number is power of 2.");
        // }else{
        //     System.out.println("Number is not power of 2.");
        // }
        // System.out.println(toggleBit(11, 2));
        // System.out.println(countLength(7));
        // System.out.println(bitCount1(7));
        // decimalToBinary(8);
        int num=1010;
        binaryToDecimal2(num);
    }
}