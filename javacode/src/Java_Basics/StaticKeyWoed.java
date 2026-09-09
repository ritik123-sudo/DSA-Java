package Java_Basics;
class student1{
    String name;
    static String school;
}

public class StaticKeyWoed {
    public static void main(String[] args) {
        student1.school="JMV";
        student1 s1=new student1();
        s1.name="Ritik";
        System.out.println(s1.school);
        System.out.println(s1.name);
    }

}
