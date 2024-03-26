//Annotations are used to provide supplemental information about a program. 
//Annotations start with ‘@’.
//Annotations basically are used to provide additional information
//Annotations help to associate metadata (information) to the program elements i.e. instance variables, constructors, methods, classes, etc.

class A{
    void showTheDataWhichBelongsToTheClass(){
        System.out.println("In A show");
    }
}
class B extends A{
    @Override
   //if the below code is used this shows error because the method name which we have to override is not same,because we misses 's' in Belongs,so override method helps us to fix this error
    // void showTheDataWhichBelongToTheClass(){
    //     System.out.println("In A show");
    // }

    void showTheDataWhichBelongsToTheClass(){
             System.out.println("In B show");
         }
}
public class Annotation {
    public static void main(String[] args) {
       B b = new B();
       b.showTheDataWhichBelongsToTheClass();
        
    }
}
