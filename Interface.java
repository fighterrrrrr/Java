//An interface is a completely "abstract class" that is used to group related methods with empty bodies
interface A
{
    int x=8;             //A variable in an interface sre final and static,so they  musthave the values 
    String str="Hello";
    void show();
    void display();
}
interface B extends A // An interface can extend another interface
{
    void display();
}
class C implements A,B{ // 'implement' is used to extend an interface,A clas can implement multiple interfaces
    public void show(){
        System.out.println("In show");
    }
    public void display(){
        System.out.println("In display");
    }
}

public class Interface {
    public static void main(String[] args) {
        C c = new C() ;
        c.show();
        c.display();

        System.out.println(c.x); //since the variables are static we can directly access without an object for variable

        //str = "Hey"; --- This line gives error because since the variables of an interface are static and final we cannot change their value
    
        
    }
}
