package Java_Basics;
// Make a Calculator using Switch Case

import java.util.*;
public class HW_Question1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.nextLine();
        String Operation=sc.nextLine();

        switch (Operation) {
            case "+":
                System.out.println(a+b);
                break;
            
            case "-":
                System.out.println(a-b);
                break;
            
            case "*":
                System.out.println(a*b);
                break;

            case "/":
                System.out.println(a/b);
                break;
            
            case "%":
                System.out.println(a%b);
                break;
        
            default:
                System.out.println("Wrong Input");
                break;
        }
    }
    
}
