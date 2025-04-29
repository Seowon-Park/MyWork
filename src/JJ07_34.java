public class JJ07_34 {
    public static void main(String[] args) {
        Outer.InstanceInner ii = new Outer().new InstanceInner();

        System.out.println("ii.iv : "+ii.iv);
        System.out.println("Outer.StaticInner.cv: "+Outer.StaticInner.cv);

        Outer.StaticInner si = new Outer.StaticInner();
        System.out.println("si.iv: "+si.iv);
    }
}

class Outer{
    class InstanceInner{
        int iv = 100;
    }
    static class StaticInner{
        int iv = 200;
        static int cv = 300;
    }
    void myMethod(){
        class LocalInner{
            int iv = 400;
        }
    }
}