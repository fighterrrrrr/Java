//Lambda exp is used only along with Functional interface in order to reduce the code

interface A{
   void show();
}
public class LambdaExpression {
    public static void main(String[] args) {
        A a = new A() {
            public void show(){
                System.out.println("In show");
            }
        };
        a.show();

        //the above code can be written using lamba expression as
        // A a =() -> System.out.println("In show");
        // a.show();

        // if the interface method has parameters like
        // interface A{
        //     void add(int i)
        // }  then--------
        // A a =(i,j) -> System.out.println(i+j);
        // a.show(5,2);

        
    }
    
}
