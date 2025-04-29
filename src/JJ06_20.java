//public class JJ06_20 {
//    int iv = 10;
//    static int cv = 20;
//
//    int iv2 = cv;
//    static int cv2 = iv;
//    static int cv2 = new JJ06_20().iv; //객체 생성과 멤버변수(인스턴스변수) 사용 동시에
//
//    static void staticMethod1(){
//        System.out.println(cv);
//        System.out.println(iv);
//        JJ06_20 c = new JJ06_20();
//    }
//    void instanceMethod1(){
//        System.out.println(cv);
//        System.out.println(iv);
//    }
//    static void staticMethod2(){
//        staticMethod1();
//        instanceMethod1();
//        new JJ06_20().instanceMethod1(); //참조 변수 선언 안했으니까, 일회용으로 사용할 때 좋음
//    }
//    void instanceMethod2(){
//        staticMethod1();
//        instanceMethod1();
//    }
//}
