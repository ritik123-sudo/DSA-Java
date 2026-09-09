package Java_Basics;
abstract class Hervivorous{
    final void eats(){
        System.out.println("Eats only Plants");
    }
}
class Hor extends Hervivorous{
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}
abstract class Animal{
    abstract void walk();
}

class Horse extends Animal{
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}
public class Abstract {
    public static void main(String[] args) {
        // Horse h1=new Horse();
        // h1.walk();

        Hor h2=new Hor();
        h2.eats();
        h2.walk();
    }
}
