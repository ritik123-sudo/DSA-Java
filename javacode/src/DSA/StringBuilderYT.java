package DSA;

public class StringBuilderYT {
    public static void main(String args[]){
        //Strings in java are immutable.
        //StringBuilder
        StringBuilder sb=new StringBuilder("Tony");
        //System.out.println(sb);

        //char at index 0
        //System.out.println(sb.charAt(0));

        //set char at index 0
        //sb.setCharAt(0,'P');
        //System.out.println(sb);

        //Insert
        sb.insert(0,'S');
        System.out.println(sb);

        //Delete
        sb.delete(0,1);
        System.out.println(sb);

        //Append
        sb.append("h");
        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o");
        System.out.println(sb);

        //length
        System.out.println(sb.length());

        //Reverse a string
        StringBuilder newString=new StringBuilder();
        for(int i=sb.length()-1;i>=0;i--){
            newString.append(sb.charAt(i));
        }
        System.out.println(newString);

    }
    
}
