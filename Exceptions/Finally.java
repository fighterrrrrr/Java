package Exceptions;

public class Finally {
    public static void main(String[] args) {
        int i=0;
        int j =0;
        try{
            j=18/i;
        }
        catch(ArithmeticException e){
            System.out.println("Can't divide by zero....... "+e);
        }
        catch(Exception e){
            System.out.println("Something went wrong....... "+e);
        }
        finally{
            System.out.println("This is finally block,and it will be executed irrespective of the exception........");
        }
    }
    
}
