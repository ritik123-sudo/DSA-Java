package Java_Basics;
import java.util.*;
public class IntegerToRoman {
    public static String intToRoman(int num) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"I");
        map.put(5,"V");
        map.put(10,"X");
        map.put(50,"XL");
        map.put(100,"C");
        map.put(500,"D");
        map.put(1000,"M");

        int idx=0;
        String result="";
        while(num!=0){
            int rem=num%10;
            int power=(int)(Math.pow(10,idx));
            idx++;
            if(rem==4){
                result=map.get(power*1)+map.get(power*5)+result;
                
            }else if(rem==9){
                result=map.get(power*1)+map.get(power*10)+result;
            }else{
                if(rem==0){
                    result=map.get(power)+result;
                }
                else if(rem<=3){
                    while(rem>0){
                        result=map.get(power)+result;
                    }
                }else if(rem>=5){
                    while(rem>0){
                        if(rem>5){
                            result=map.get(power*1)+result;
                            rem--;
                        }else{
                            result=map.get(power*5)+result;
                            rem=rem-5;
                        }
                    }
                }
            }
            num=num/10;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(intToRoman(3749));
    }
}
