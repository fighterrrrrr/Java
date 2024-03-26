class Student{
    int rollno;
    String name;
    int marks;
}
public class ArrayInClass {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.rollno=15;
        s1.name="Ajay";
        s1.marks=70;

        Student s2=new Student();
        s2.rollno=19;
        s2.name="Ankitha";
        s2.marks=79;

        Student s3=new Student();
        s3.rollno=15;
        s3.name="Ajay";
        s3.marks=70;

        Student students[]=new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        // for(int i=0;i<students.length;i++){
        //     System.out.println(students[i].name+" "+students[i].rollno+" "+students[i].marks);
        // }

        // using advanced for loop
        //here Student is the type of the array students
        for(Student s:students){
            System.out.println(s.name+" "+s.rollno+" "+s.marks);
        }

        
    }
    
}
