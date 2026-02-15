import java.util.ArrayList;

public class try1 {

    
    public static boolean checkNum(int num, int k)
    {
        int length = (int)(Math.log10(num))+1;
       // int copy = num;
        int d[] = new int[length];
        int i = 0;
        while(num>0) {

            int ld= num%10;
            d[i]=ld;
            i++;
            num=num/10;
        }

        ArrayList<Integer> dis= new ArrayList<>(k);
        dis.add(0);
        dis.add(1);


        //comparison

        for( i = 0; i<length; i++)
        {
           
            if(dis.contains(d[i])==true) return true ; 
            
        }
        return false;
        



    }

    public static void main(String[] args) {

        int num=100;
        int k=2;
        
        while(checkNum(num, k)==true)
        {
            
            num++;
        }

        System.out.println(num);
    }
}
