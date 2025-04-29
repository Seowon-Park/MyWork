public class JJ06_19 {
    public static void main(String[] args) {
        System.out.println(MyMath2.add(200L,200L));
        System.out.println(MyMath2.sub(200L,200L));
        System.out.println(MyMath2.mult(200L,200L));
        System.out.println(MyMath2.div(200d,200d));

        MyMath2 mm = new MyMath2();
        mm.a = 200L;
        mm.b = 200L;

        System.out.println(mm.add());
        System.out.println(mm.sub());
        System.out.println(mm.mult());
        System.out.println(mm.div());
    }
}
class MyMath2{
    long a, b;

    long add() {return a+b;}
    long sub() {return a-b;}
    long mult() {return a*b;}
    double div() {return a/b;}

    static long add(long a, long b) {return a+b;}
    static long sub(long a, long b) {return a-b;}
    static long mult(long a, long b) {return a*b;}
    static double div(double a, double b) {return a/b;}
}
