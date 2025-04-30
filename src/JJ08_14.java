public class JJ08_14 {
    public static void main(String[] args) {
        try{
            method1();
        }catch(Exception e){
            System.out.println("method1에서 예외 처리됨.");
            e.printStackTrace(System.out);
        }
    }
    static void method1() throws Exception {
        throw new Exception();
    }
}