//Method overriding is called as runtime polymorphism
// it is redefining the parent class method in the sub class
class Computer{
    void show(){
        System.out.println("In computer");
    }
}
class Laptop extends Computer{
    void show(){
        System.out.println("In Laptop");
    }
}
public class MethodOverride {
    public static void main(String[] args) {
        Computer c=new Laptop();
        c.show();
    }

    
}
