package Threads;
class A extends Thread{
    public void run(){
        for(int i=0;i<1000;i++){
            System.out.println("hi");
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=0;i<1000;i++){
            System.out.println("hello");
        }
    }
}


public class MutipleThread {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();
        
    }
    
}