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

        Student zoheeb;
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
}
