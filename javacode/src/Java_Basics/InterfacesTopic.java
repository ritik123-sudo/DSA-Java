package Java_Basics;

interface animal{
    int eye=2;
    void walk();
    
}
interface herbivorous{
    void eats();
}

class horse implements animal,herbivorous{
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
    public void eats(){
        System.out.println("Eats Plant Only");
    }
}
public class InterfacesTopic {
    public static void main(String[] args) {
        horse h1=new horse();
        System.out.println(h1.eye);
        h1.walk();
        h1.eats();
    }
}
