package Exceptions;

public class MultiCatch {
    public static void main(String[] args) {
        int i =0;
        int a[] = new int[5];
        try{
            a[5]=2;
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero "+e);// e shows the exception
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Size of array excceded "+e);
        }
        catch(Exception e){//It is the parent class Exception. This exception should be at last only i.e before these exceptions or else i.e if it is top it gives error at other catch block,because this can handle any type of exception and other don't have any job to do.
            System.out.println("Something went wrong "+e);
        }
    }
    
}
