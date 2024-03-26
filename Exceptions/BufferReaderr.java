package Exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderr  {
    public static void main(String[] args) throws NumberFormatException, IOException {
        System.out.println("Enter the number");
        InputStreamReader i = new InputStreamReader(System.in);
        BufferedReader b = new  BufferedReader(i);
        int num = Integer.parseInt(b.readLine());
        System.out.println("Number is "+num);
        
      
        

    }
    
}
