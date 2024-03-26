class A{
    int x=10;
    String y="Hello";

    A(){
        System.out.println("In Constructor");
        System.out.println(x+" "+y);
    }
}
public class Constructor {
    public static void main(String[] args) {
        A a=new A();

        A b=new A();
        
    }
    
}
