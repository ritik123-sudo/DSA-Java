import java.util.*;
public class euler_totient {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : " );
        int n=sc.nextInt();
        int res=n;
        for(int p=2;p*p<=n;p++){
            while(n%p==0){
                n=n/p;
            }
            res=res-res/p;
        }
        if(n>1){
            res=res-res/n;
        }
        System.out.println(res);
        sc.close();
    }
    
}
