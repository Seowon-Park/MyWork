public class JJ03_26 {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        System.out.printf("a=%d, b=%d%n", a, b);
        System.out.printf("a!=0 || ++b!=0 => %b%n", a!=0 || ++b!=0); // a!=0에서 연산 처리가 끝낫으니까 ++b 실행 안된거임
        System.out.printf("a=%d, b=%d%n", a, b);
        System.out.printf("a==0 && ++b!=0 => %b%n", a==0 && ++b!=0);
        System.out.printf("a=%d, b=%d%n", a, b);

    }
}
