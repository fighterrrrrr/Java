public class string {
    public static void main(String[] args) {
        String college="Nagarjuna College ";
        System.out.println(college);
        
        //concatenation
        String x=college.concat("Engineering and ");
        System.out.println(x);
        x=x+"Technology  ";
        System.out.println(x);
        
        String y="Nagarjuna";

        System.out.println(x.charAt(4));
        System.out.println("length:"+x.length());
        System.out.println("subString:"+x.substring(4,8 ));
        System.out.println("Trim:"+x.trim());
        System.out.println(x.equals(y));
       // x.append("tukali");--- This dont work because strings in java are immutable,to make it mutable StringBuffer and StringBuilder are used

    }
    
}
