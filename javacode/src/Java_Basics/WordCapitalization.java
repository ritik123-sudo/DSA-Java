package Java_Basics;

import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        StringBuilder sb=new StringBuilder();
        sb.append(Character.toUpperCase(str.charAt(0)));
        sb.append(str.substring(1));

        System.out.println(sb);
    }
}
