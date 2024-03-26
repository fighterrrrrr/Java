//A final keyword can be used with variable,method,class

public class FinalKeyword {
    public static void main(String[] args) {
        //-----------Final with variable
        final int x=8;
            //x=9;  if this line is executed we get the error because x is defined as final,so if a variable is defined with final that variable value cannot be changed again
        System.out.println(x);

        //------------Final with class
        //When no one should inherit a class then make the class as final i.e to stop inheritance use final
        final class A {
            void show(){
                System.out.println("In A");
            }    
        }
        //    class B extends A{
        //       }  //  if this is executed we will get an error because we are trying to inherit class A ,but parent is defined as final 

        
        
        //------------Final with method
        //When no should override a method then make that method as final,So method overriding is prevented
        class A1{
            final void show(){
                System.out.println("In show");
            }
        }
        class A2 extends A1{
          //  void show(){ ----if this line is executed we get error because it cannot override show() in A1 because it is final
                
            }
        }
        
    }

    
}
