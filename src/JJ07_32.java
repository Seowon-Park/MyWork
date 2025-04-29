public class JJ07_32 {
    class InstanceInner{}
    static class StaticInner{}

    InstanceInner iv = new InstanceInner();
    static StaticInner cv = new StaticInner();

    static void staticMethod(){
        //InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();
        JJ07_32 outer = new JJ07_32();
        InstanceInner obj1 = outer.new InstanceInner();//인스턴스 클래스는 외부 클래스를 먼저 생성해야만 생설할 수 있음.
    }

    void instanceMethod(){
        InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();
        //LocalInner lv = new LocalInner();
    }

    void myMethod(){
        class LocalInner{}
        LocalInner lv = new LocalInner();
    }
}
