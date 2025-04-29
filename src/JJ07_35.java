//public class JJ07_35 {
//    public static void main(String[] args) {
//        Outer outer = new Outer();
//        Outer.Inner inner = outer.new Inner();
//        inner.method1();
//    }
//}
//
//class Outer{
//    int value = 10;
//
//    class Inner{
//        int value = 20;
//
//        void method1(){
//            int value = 30;
//            System.out.printf("%20s : %d%n","value",value);
//            System.out.printf("%20s : %d%n","this.value",value);
//            System.out.printf("%20s : %d%n","Outer.this.value",value);
//        }
//    }
//}