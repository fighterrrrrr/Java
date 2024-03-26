
import java.util.*;

public class Decision{
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(x%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        
    }
}