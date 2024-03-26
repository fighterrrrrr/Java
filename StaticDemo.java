// class Employee{
//     String empName;
//     int id;
//     static String Ceo;

//     void show(){
//         System.out.println(empName+" "+id+" "+Ceo);
//     }
// }
// public class StaticDemo {
//     public static void main(String[] args) {
//         Employee e1=new Employee();
//         e1.empName="Balu";
//         e1.id=05;
//         e1.Ceo="God";

//         Employee e2=new Employee();
//         e2.empName="Bhavana";
//         e2.id=15;
//         //e2.Ceo="God";

        //so if Ceo of one changes Ceo of all others should be same that means if value of a variable changes for one object then it should reflect for all objects,So basically the concept is if we want a variable to be same for all the objects then 'static' should be used
        //e2.Ceo="goddess";

        //e1.show();
        //e2.show();  
    //----------------------------------------------------------------------------
    class Employee{
        //since the static variable should be same for all objects,if there is a constructor method then every time an object created the static variable present within the constructor will be also initialized every time,so  no need to call that every time ,so include it in a static block
       // Static block is called only once
      
        String empName;
        int id;
        static String Ceo;
        static {
            String Ceo="God";
            System.out.println("in Static");
        }
       public Employee(){
          System.out.println("In Constructor");
        }
    
        void show(){
            System.out.println(empName+" "+id+" "+Ceo);
        }
    }
    public class StaticDemo {
        public static void main(String[] args) {
            Employee e1=new Employee();
            e1.empName="Balu";
            e1.id=05;
           
            
            Employee e2=new Employee();
            e2.empName="Bhavana";
            e2.id=15;
            //e2.Ceo="God";    
    
            e1.show();
            e2.show();
      
       
    }
    
}
