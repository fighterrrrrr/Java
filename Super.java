//super is used to call a superclass constructor
//Every constructor consists of super() as a default method at starting of constructor even thuough if we dont mention
//---------------------------------
//super()-executes constructor of super class
//this()-executes constructor of same class
class A{
    public A(){
        super();
        System.out.println("in A");
    }
    public A(int n){
        this(); // executes constructor of same class
        //super();
        System.out.println("in int A");
    }
}
class B extends A{
    public B(){
        super();
        System.out.println("in B");
    }
    public B(int n){
        super(n);
        System.out.println("in int B ");
    }
}
public class Super {
    public static void main(String[] args) {
        B b = new B(5);
    }
    
}
