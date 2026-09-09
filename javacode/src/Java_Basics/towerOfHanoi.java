package Java_Basics;

public class towerOfHanoi {
    public static void toh(String  source,String helper,String  destination,int n){
        if(n==0){
            return;
        }
        toh(source,destination,helper,n-1);
        System.out.println("Transfer disc from "+source+" to "+destination);
        toh(helper,source,destination,n-1);
    }
    public static void main(String[] args) {
        toh("A","B","C",3);
    }
    
}
