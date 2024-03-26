//This program is also an example for Encapsulation and Getters and setters
class human{
    //Encapsulation-Encapsulation in Java refers to integrating data (variables) and code (methods) into a single unit. In encapsulation, a class's variables are hidden(private) from other classes and can only be accessed by the methods of the class in which they are found.
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String namee){
        name=namee;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int agee){
        age=agee;
    }

    void show(){
        System.out.println(name+" "+age);
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        human h1=new human();
        //h1.age=5; This line gives an error because age is an encapsulated variable i.e by making it as private for protection which is the purpose of Encapsulation
        h1.setAge(5);
        h1.setName("Java");
        h1.show();
       
        


        
    }
    
}
