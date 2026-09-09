package Java_Basics.Bank;
class Account{
    public String name;
    protected int age;
    private String password;
    // getter and setter
    public void get(){
        System.out.println(this.password);
    }
    public void set(String password){
        this.password=password;
    }
}

public class bank {
    public static void main(String[] args){
        // System.out.println("Hello World");
        Account e1=new Account();
        e1.name="Ritik";
        e1.age=24;
        e1.set("Ritik");
        e1.get();

    }
}
