// package Java_Basics;
import java.util.*;
public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int row=0;
        int column=0;
        for(int i=0;i<5;i++){
            String s=sc.nextLine();
            String[] si=s.split(" ");

            for(int j=0;j<5;j++){
                if(si[j].equals("1")){
                    row=i+1;
                    column=j+1;
                }
            }
        }
        int count =0;
        while(row!=3 || column!=3){
            if(row<3 && column <3){
                count+=2;
                row++; column++;
            }else if(row<3 && column > 3){
                count+=2;
                row++; column--;
            }else if(row > 3 && column < 3){
                count+=2;
                row--; column++;
            }else if(row > 3 && column > 3){
                count +=2;
                row --; column--;
            }else if(row>3){
                count++;
                row--;
            }else if(row<3){
                count++;
                row++;
            }else if(column>3){
                count++;
                column--;
            }else if(column<3){
                count++;
                column++;
            }
        }
        System.out.println(count);
    }
}