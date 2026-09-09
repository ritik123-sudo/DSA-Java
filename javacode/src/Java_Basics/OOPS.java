package Java_Basics;
import Java_Basics.Bank;
class Pen{
        String color;
        String type;

        public void write(){
            System.out.println("Writing Something ");
        }

        public void printColor(){
            System.out.println(this.color);
        }
}

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name,int age){
        System.out.println("Name: "+name+"  "+"Age: "+age);
    }

    Student(){

    }

    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    Student(Student s){
        this.name=s.name;
        this.age=s.age;
    }
}
class Shape{
    public void area(){
        System.out.println("Displays Area");
    }

}

class Triangle extends Shape{
    public void area(int b,int h){
        System.out.println("Area of Triangle is "+(1/2*b*h));
    }
}

class Circle extends Shape{
    public void area(int r){
        System.out.println("Area of Circle : "+(3.14*r*r));
    }
}
class EquilateralTriangle extends Triangle{
    public void area(int l,int h){
        System.out.println("Area of Triangle "+(1/2*l*h));
    }
}


public class OOPS {

    public static void main(String[] args) {
        // Pen p1=new Pen();
        // p1.color="Blue";
        // p1.type="Gel";
        
        // Pen p2=new Pen();
        // p2.color="Black";

        // p1.printColor();
        // p2.printColor();

        // Student s1=new Student();
        // s1.name="Ritik";
        // s1.age=23;
        // s1.printInfo();

        // Student s1=new Student("Ritik",23);
        // Student s2=new Student(s1);

        // s2.printInfo();

        // Student s1=new Student();
        // s1.printInfo("Ritik");
        // s1.printInfo(24);
        // s1.printInfo("Ritik",24);

        // Circle c=new Circle();
        // c.area(2);
        Account c1=new Account();
        c1.name="Ritik";
        System.out.println(c1.name);

    }
    
}
