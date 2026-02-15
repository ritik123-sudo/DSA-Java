import java.util.*;
public class waytoolong {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        sc.nextLine();
        String[] arr=new String[n];
        for(int i=0;i<n;i++){
            String w=sc.nextLine();
            arr[i]=w;
        }
        for(int i=0;i<n;i++){
            if(arr[i].length()>10){
                int last_index=arr[i].length()-1;
                char firstletter=arr[i].charAt(0);
                char lastletter=arr[i].charAt(last_index);
                System.out.println(""+ firstletter+  (arr[i].length()-2) + lastletter);
            }
            else{
                System.out.println(arr[i]);
            }
        }

    }
    
}
