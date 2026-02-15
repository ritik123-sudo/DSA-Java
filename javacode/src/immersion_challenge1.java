import java.util.*;
public class immersion_challenge1 {
    public static void main(String[] args){
        int N=0;
        int length = (int)(Math.log10(N))+1;
        
        
        int k=2;
        ArrayList<Integer> d=new ArrayList<>(k);
        d.add(0);
       d.add(9);
        
        while(true){
            if(N==0&&!d.contains(0)){
                break;
            }else if (N==0&&d.contains(0)){
                N++;
                continue;
            }
            int num=N;
            length = (int)(Math.log10(N))+1;
            int initial_number=N;
            for(int i=0;i<length;i++){
                if(d.contains(num%10)){
                    N++;
                    break;

                }else{
                    num=num/10;
                }
                

            }
            if(initial_number==N){
                break;
            }
        }
        System.out.println(N);

    }
}