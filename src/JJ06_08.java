public class JJ06_08 {
    public static void main(String[] args) {
        System.out.println("main시작");
        firstMethod();
        System.out.println("main끝");
    }
    static void firstMethod(){
        System.out.println("firstMethod시작");
        secondMethod();
        System.out.println("firstMethod끝");
    }
    static void secondMethod(){
        System.out.println("secondMethod 시작");
        System.out.println("secondMethod 끝");
    }
}
