package DSA;

public class RecursionYT {
    public static void  printnumb(int n){
        if(n==0){
            return;
        }
        //System.out.println("While Calling : "+n);
        printnumb(n-1);
        System.out.println(n);
        //System.out.println("while return : "+n);

    }

    //Sum of first n natural numbers
    public static void print_n_natuarl_num(int n,int sum){
        if(n==0){
            System.out.println(sum);
            return;
        }
        sum=sum+n;
        print_n_natuarl_num(n-1, sum);
        
    }

    public static int printsumupton(int n){
        if(n==0){
            return 0;
        }
        return n+printsumupton(n-1);
    }
    //Factorial of number n
    public static void factorial_void(int n,int prod){
        if(n==0||n==1){
            System.out.println(prod);
            return;
        }
        prod=n*prod;
        factorial_void(n-1, prod);
        
    }
    public static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
       // System.out.println(n);
        return n*factorial(n-1);
        
    }
    //Fibonacci
    public static void fibonacci(int a,int b,int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        fibonacci( b, c, n-1);
    }
    //print x to the power n
    public static int power(int n,int k){
        if(n==0){
            return 0;
        }
        if(k==0){
            return 1;
        }
        //System.out.println(k);
        return n*power(n,k-1);
    }
    //Optimized x to the power n 
    public static int calcpower(int x,int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        int lpownum=calcpower( x,n/2);
        int rpownum=calcpower(x,n/2);
        if(n%2!=0){
            return x*lpownum*rpownum;
        }else{
            return lpownum*rpownum;
        }
    }
    
    
    public static void main(String [] args){
        //printnumb(5);

       // print_n_natuarl_num(5,0);
       //System.out.println(printsumupton(5));
       //factorial_void(5, 1);
    //    System.out.println(factorial(5));
    // int n=8;
    // System.out.println(0);
    // System.out.println(1);
    // fibonacci(0,1,n-2);
        System.out.println(calcpower(5, 3));

    }
    
}
