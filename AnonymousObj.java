class A{

    A()
    {
        System.out.println("Object created");
    }
    
    void show(){
        System.out.println("In show");
    }
    
    
}
public class AnonymousObj {
    public static void main(String[] args) {
        new A().show(); //anonymous object i.e object without reference,but disadvantage is we cant use this for multiple times
    }
    
}
