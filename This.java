class human{
    //In a class,if the names of local variable(in method) and instance variable are same,then in order to differentiate them 'this' keyword is used

    //'this' refers to the current object in a method or constructor
    private String name;//instance variable
    private int age;//instance variable

    public String getName(){
        return name;
    }

    public void setName(String name){//name here is local variable
        this.name=name;//here this refers to the object h1
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){//age here is local variable
        this.age=age;
    }

    void show(){
        System.out.println(name+" "+age);
    }
}
public class This {
    public static void main(String[] args) {
        human h1=new human();
        h1.setAge(5);
        h1.setName("Java");
        h1.show();
       
        


        
    }
    
}
 

