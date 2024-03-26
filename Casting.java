class A {
    void show1(){
        System.out.println("In show1");
    }
}

class B extends A{
    void show2(){
        System.out.println("In show2");
    }
}

public class Casting {
    public static void main(String[] args) {
        // double d =4.5;
        // int i=(int)d;      //TypeCasting,but we lose some data
        // System.out.println(i);

        A obj =(A) new B();    //Upcasting
        obj.show1();

        
        B obj1 =(B) obj;    //Downcasting
        //here obj is parent reference ,so from parent we convert to child so it is downcasting
        obj1.show2();



        
        

    }
    
}
