package introduction;

public class Main {
    public static void main(String[] args) {
        // store 5 roll num
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5 students: {roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];


        Student[] student = new Student[5];

        Student zoheeb = new Student(13,"zoheeb ishaque",88.5f);
        Student ali = new Student(14,"ali mawla",99.99F);

        System.out.println(zoheeb.name);
        System.out.println(zoheeb.marks);
        System.out.println(zoheeb.rno);

        System.out.println(ali.name);
        System.out.println(ali.marks);
        System.out.println(ali.rno);
    }

}
// create a class
class Student {
    int rno ;
    String name ;
    float marks ;

    public Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}
