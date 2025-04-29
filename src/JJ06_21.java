public class JJ06_21 {
    public static void main(String[] args) {
        MyMath3 mm = new MyMath3();
        System.out.println("mm.add(3,3)결과:"+mm.add(3,3));
        System.out.println("mm.add(3,3)결과:"+mm.add(3L,3));
        System.out.println("mm.add(3,3)결과:"+mm.add(3,3L));
        System.out.println("mm.add(3,3)결과:"+mm.add(3L,3L));
    }
}
class MyMath3{
    int add(int a, int b){
        System.out.print("int add(int, int) - ");
        return a+b;
    }
    long add(int a, long b){
        System.out.print("int add(long, int) - ");
        return a+b;
    }
    long add(long a, int b){
        System.out.print("int add(int, long) - ");
        return a+b;
    }
    long add(long a, long b){
        System.out.print("int add(long, long) - ");
        return a+b;
    }
}