public class stringBuffer {
    public static void main(String[] args) {
        // x.append("tukali");--- This dont work because strings in java are immutable,to make it mutable StringBuffer and StringBuilder are used
        StringBuffer s= new StringBuffer("Hi ");
        s.append("Hello ");
        System.out.println(s);
        s.append("world!!");
        System.out.println(s);
        System.out.println(s.capacity());
        System.out.println(s.insert(3,"java"));

        //StringBuilder also has same functionality as stringBuffer,but stringbuffer is thread safe

    }
}
