//Enum is a special data type that consists of a set of pre-defined named values separated by commas. These named values are also known as elements or enumerators or enum instances. Since the values in the enum type are constant

enum Status{
    Running,Failed,Pending,Success;//thses are objects or constants of enum class
}

// enum Laptop{
//     Macbook(5000),Dell(4000),Hp,Lenovo(3900);

//     int price;
    // but if this int price is private then in order to access them use getters and setters 

//     private Laptop(int price) { //this is a parameterized constructor 
//         this.price = price;
//     }

    //but if we don't specify the price of a laptop then it gives an error ,so to resolve this use a non-parameterized constructor
//     Laptop(){
//         price=500;
//     }
    //i.e if 'private int price'
//     public int getPrice() {
//         return price;
//     }
//     public void setPrice(int price) {
//         this.price = price;
//     }
// }

public class Enum {
    public static void main(String[] args) {
        Status s = Status.Running;
        System.out.println(s);
        System.out.println(s.ordinal());

        Status s1 = Status.Success;
        System.out.println(s1);
        System.out.println(s1.ordinal());

        //To display all the objects of enum class

        // Status[] s3 = Status.values();
        // for(Status a:s3){
        //     System.out.println(a);

        //Example for enum

        // Laptop lap = Laptop.Macbook;
        // System.out.println(lap);
        // System.out.println(lap.price);
        // lap.price=5500;
        // System.out.println(lap.price);

        // Laptop l = Laptop.Hp;
        // l.price=5200;
        // System.out.println(l.price);


       
        



        //enum display using if else

        // Status s = Status.Pending;
        // if(s == Status.Running){
        //     System.out.println("All Good "+s.ordinal());
        // }
        // else if(s == Status.Failed){
        //     System.out.println("Try Again "+s.ordinal());
        // }
        // else if(s == Status.Pending){
        //     System.out.println("Please wait "+s.ordinal());
        // }
        // else{
        //     System.out.println("success "+s.ordinal());
        // };

        //enum using switch case

        // Status s = Status.Failed;
        // switch(s){
        //     case Running:
        //          System.out.println("All Good");
        //          break;
        //     case Failed:
        //          System.out.println("Try Again");
        //          break;
        //     case Pending:
        //          System.out.println("Please wait ");
        //          break;
        //     default:
        //         System.out.println("Success");
            
        
        // }

        
    }
    
}
