public class JJ08_19 {
    public static void main(String[] args) {
        JJ08_19.method1();
        System.out.println("method1");
    }
    static void method1(){
        try{
            System.out.println("method1()이 호출되었습니다.");
            throw new Exception();
            //return;
        }catch(Exception e){
            e.printStackTrace(System.out);
        }finally {
            System.out.println("method1()의 finally블록 실행");
        }
    }
}
