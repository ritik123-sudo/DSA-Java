package Java_Basics;

public class Recursion {
    // print numbers from 5 to 1
    public static void printNumbers(int n){
        if(n==0){
            return ;
        }
        System.out.print(n+" ");
        printNumbers(n-1);
    }
    // print numbers from 1 to 5
    public static void printNumbersInverse(int n){
        if(n==0){
            return ;
        }
        // System.out.print(n+" ");
        printNumbersInverse(n-1);
        System.out.print(n+" ");
    }

    // sum of first n natural numbers
    public static int sunofFirstnNatural(int n){
        if(n==0){
            return 0;
        }
        return n+ sunofFirstnNatural(n-1);
    }
    // print factorial of n
    public static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void   fibonacci(int a,int b,int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.print(c+" ");
        fibonacci(b, c, n-1);
    }


    // print x raise to the power n
    public static int calcPower(int x,int n){
        if(n==0){
            return 1;
        }
        if(n==1){
            return x;
        }
        return x*calcPower(x, n-1);
    }

    public static int optimizedCalcPower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0) return 0;

        if(n%2==0){
            return optimizedCalcPower(x, n/2)*optimizedCalcPower(x, n/2);
        }else{
            return optimizedCalcPower(x, n/2)*optimizedCalcPower(x, n/2)*x;
        }
    }
    public static void main(String[] args) {
        // printNumbersInverse(5);
        // System.out.println(sunofFirstnNatural(5));
        // System.out.println(factorial(10));
        // int n=10;
        // System.out.print(0+" "+1+" ");
        // fibonacci(0,1,n-2);
        System.out.println(optimizedCalcPower(23,1));
    }
    
}
