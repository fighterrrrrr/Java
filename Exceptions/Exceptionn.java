package Exceptions;

public class Exceptionn {
    public static void main(String[] args) {
        int i=0;
        int j=0;
    try{
        j = 10/i;
    }
    catch(Exception e){
        j = 10/1;
        System.out.println("Exception Handled"+e);
    }
    System.out.println(j);

    }
    
        
    }
    
    

