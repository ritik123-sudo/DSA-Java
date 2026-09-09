package Java_Basics;

import java.util.Scanner;

public class HW_Question9 {

    // Enter 3 numbers from the user & make a function to print their average.
    public static int printAverage(int a,int b,int c){
        return (a+b+c)/3;
    }

    // Write a function to print the sum of all odd numbers from 1 to n.
    public static int sumOfOdd(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum=sum+i;
            }
        }
        return sum;
    }

    // Write a function which takes in 2 numbers and returns the greater of those two.
    public static int greater(int a,int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }

    //Eligibility Check
    public static void Eligibility(int age){
        if(age>18){
            System.out.println("Eligibile to Vote");
        }else{
            System.out.println("Not Eligible to vote");
        }
    }

    
    public static double calculateCircumference(double  radius){
        double pi=3.14;
        return 2*pi*radius;
    }

    // Infinite do while
    public static void Infinite_do_while(){
        do{
            System.out.println("Infinite Loop");
        }while(true);
    }

    // count of positive ,negative and zeros
    public static void countNumbers(){
        Scanner sc=new Scanner(System.in);
        int positive_count=0;
        int negative_count=0;
        int zeros_count=0;
        int number;

        do{
            number=sc.nextInt();
            if(number>0){
                positive_count++;
            }else if(number<0){
                negative_count++;
            }else if(number==0){
                zeros_count++;
            }
        }while(number!=-16);
        System.out.println("Positive Count : "+positive_count);
        System.out.println("Negative Count : "+negative_count);
        System.out.println("Zeros Count : "+zeros_count);
    }

    // Calculate Powwer
    public static double calculatePower(double x,int n){
        double power=x;
        for(int i=2;i<=n;i++){
            power=power*x;
        }
        return power;
    }

    // GCD of Two Numbers
    public static int GCD_of_Two_Numbers(int a,int b){
        int smaller=Math.min(a,b);
        int gcd=1;
        for(int i=1;i<=smaller;i++){
            if(a%i==0&&b%i==0){
                gcd=i;
            }
        }
        return gcd;
    }

    public static int euclideanGCD(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }

    // Calculate Fibonacci
    public static void Fibonacci(int n){
        int prevfibonacci=0;
        int nextfibonacci=1;
        for(int i=1;i<=n;i++){
            System.out.print(prevfibonacci+" ");
            int temp=prevfibonacci+nextfibonacci;
            prevfibonacci=nextfibonacci;
            nextfibonacci=temp;
        }

    }
    public static void main(String[] args) {
        // System.out.println(printAverage(3,2,7));
        // System.out.println(sumOfOdd(10));
        // System.out.println(greater(25, 365));
        // double radius=2;
        // System.out.println(calculateCircumference(radius));

        // Eligibility(15);
        // Infinite_do_while();
        // countNumbers();

        // System.out.println(calculatePower(5, 3));

        // System.out.println(GCD_of_Two_Numbers(8, 9));

        // System.out.println(euclideanGCD(42,126));
        Fibonacci(9);
    }
    
}
