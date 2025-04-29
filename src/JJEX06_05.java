public class JJEX06_05 {
    public static void main(String[] args) {
        Student s = new Student("홍길동",1,1,100,60,67);
        System.out.println(s.info());
    }
}
class Student{
    String name;
    int ban, no;
    int kor,eng,math;

    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
        String info(){return name+","+ban+","+no+","+kor+","+eng+","+math;}
}