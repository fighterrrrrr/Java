//when we dont know the implementation of a method in the class ,but it may be implemented by someone so in order to keep that method make it as abstract

//but if we want to declare a method as abstract then that class should  aslo be as abstract

//we cannot create an object of abstract class
abstract class Car{
    abstract void drive(); //we dont know the implementation,so it can be called as method declaration,and it can be defined in other class
    void playMusic(){
        System.out.println("Play Music");
    }
}
class Swift extends Car{
    void drive(){
        System.out.println("Driving");
    }

}
public class Abstract {
    public static void main(String[] args) {
        //Car obj = new Car() -- it gives error because an object of abstract class cant be created
        Swift s =new Swift();
        s.drive();
        s.playMusic();   
        };
    }

    

