//Functional Interface is an interface with only one method,it is also called as SAM--Single abstract method
interface Z{
    void show();
}
// class X implements A{
//     public void show(){
//         System.out.println("In show");    // This can also be implemented as anonymous inner class
//     }
// }
public class FunctionalInterface {
    public static void main(String[] args) {
        Z x = new Z(){
            public void show(){
               System.out.println("In show");   
            }
        };
        x.show();
    
}
}
