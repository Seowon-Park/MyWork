import java.util.*;

public class JJ11_03 {
    public static void main(String[] args) {
        Vector v = new Vector(5);
        v.add("1");
        v.add("2");
        v.add("3");
        print(v);

        v.trimToSize();
        System.out.println("=trimToSize=");
        print(v);

        v.ensureCapacity(6);
        System.out.println("=ensureCapacity=");
        print(v);

        v.setSize(7);
        System.out.println("=setSize=");
        print(v);

        v.clear();
        System.out.println("=clear=");
        print(v);

    }
    public static void print(Vector v){
        System.out.println(v);
        System.out.println("size: "+v.size());
        System.out.println("capacity:"+v.capacity());
    }
}
