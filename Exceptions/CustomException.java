package Exceptions;

class VandanaException extends Exception
{
    public VandanaException(String string)
    {
       // super(string);

    }
}
public class CustomException {
    public static void main(String[] args) {
        int i=0;
        int j=0;
        try{
            j=18/19;
            if(j==0){
                throw new VandanaException("I don't want to print zero");  // throw keyword is used to throw the exception if the output obtained is not satisfied by the user.
            }
        }
        catch(VandanaException e){
            j=18/1;
            System.out.println("That's the default output "+e);

        }
        catch(Exception e){
            System.out.println("Something went wrong "+e);
        }
        System.out.println(j);
    }
    
}
