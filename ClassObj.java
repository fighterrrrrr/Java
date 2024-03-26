class Employee{
    int id;
    String name;

    public void show(){
        System.out.println(id+" "+name);
    }
}

public class ClassObj {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.id=23;
        e1.name="Amar";
        e1.show();
    }
    
}
