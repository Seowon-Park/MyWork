public class JJ07_30 {
    public static void main(String[] args) {
        Child c = new Child();
        c.method1();
        c.method2();
        MyInterface.StaticMethod();
        MyInterface2.StaticMethod();
    }
}

class Child extends Parent implements MyInterface,MyInterface2{
    public void method1(){
        System.out.println("method1() in Child");
    }
}
class Parent{
    public void method2(){
        System.out.println("method2() in Parents");
    }
}
interface MyInterface{
    default void method1(){
        System.out.println("method1() in MyInterface");
    }
    default void method2(){
        System.out.println("method2() in MyInterface");
    }
    static void StaticMethod(){
        System.out.println("StaticMethod() in MyInterface");
    }
}
interface MyInterface2{
    default void method1(){
        System.out.println("method1() in MyInterface2");
    }
    static void StaticMethod(){
        System.out.println("StaticMethod() in MyInterface2");
    }
}