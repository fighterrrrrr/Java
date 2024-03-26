class calculator{
    void add(int a,int b){
        System.out.println(a+b);
    }

    void sub(int a,int b){
        System.out.println(a-b);
    }
}
class AdvancedCalc extends calculator{
    void mul(int a,int b){
        System.out.println(a*b);    
    }
}
class MoreAdvanced extends AdvancedCalc{
    void power(int a,int b){
        System.out.println((int)Math.pow(a, b));
    }    
}
public class Inheritance {
    public static void main(String[] args) {

        MoreAdvanced a1 =new MoreAdvanced();
        a1.add(5,6);
        a1.power(2,3);
        
    }
    
}

