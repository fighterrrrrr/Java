class Calculator{
    //Method overloading is a compile time polymorphism in which same method is defined with different arguments.
    public void add(){
        System.out.println("adding");
    }
    public int add(int n,int n1,int n2){
        return n+n1+n2;
    }
    public int add(int n1,int n2){
        return n1+n2;
    }
    public double add(double n1,int n2){
        return n1+n2;

    }
}
public class MethodOverload {
    public static void main(String[] args) {
        Calculator c1 =new Calculator();
        System.out.println(c1.add(2.1,3));
       
        int x=c1.add(2,3,5);
        System.out.println(x);

        Calculator c2=new Calculator();
        double y=c2.add(5.5555,2);
        System.out.println(y);

    }
    
}
