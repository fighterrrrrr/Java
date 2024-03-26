//Inner class -- A class within another class
class A{
    int age;
    void show(){
        System.out.println("In show");
    }

    class B{
        void config(){
            System.out.println("In Config");
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        A.B obj1 =obj.new B();
        obj1.config();


    }
    
}
