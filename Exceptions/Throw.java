package Exceptions;

public class Throw {
    public static void main(String[] args) {
        int i=0;
        int j=0;
        try{
            j=18/19;
            if(j==0){
                throw new ArithmeticException();  // throw keyword is used to throw the exception if the output obtained is not satisfied by the user.
            }
        }
        catch(ArithmeticException e){
            j=18/1;
            System.out.println("That's the default output "+e);

        }
        System.out.println(j);
    }
    
}
