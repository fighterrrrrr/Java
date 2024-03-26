public class WrapperClass {
    public static void main(String[] args) {
        //Boxing--if a primitive value is store in an object it is Boxing
        int num=7;
        Integer n1=new Integer(num); //boxing 
        //but 
        
        //Auto-Boxing
        Integer n2=num; //Auto-Boxing
        System.out.println(n1+" "+n2);

        //UnBoxing--if the object value is made as primitive value it is Unboxing
        int num1=n2.intValue(); //UnBoxing

        //Auto-UnBoxing
        int num2=n2;

        System.out.println(num1+" "+num2);

        //String is converted into integer by using parseInt()
        String s="12";
        int x=Integer.parseInt(s);
        System.out.println(x*2);



    }
    
}
