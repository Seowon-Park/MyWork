public class JJ03_21 {
    public static void main(String[] args) {
        System.out.printf("10==10.0f\t %b%n", 10==10.0f); //비교 연산자도 연산자다! 두 피연산자의 타입을 같게한 후 비교함
        System.out.printf("'0'==0\t %b%n", '0'==0);
        System.out.printf("'A'==65\t %b%n", 'A'==65);
        System.out.printf("'A'>'B'\t %b%n", 'A'>'B');
        System.out.printf("'A'+1 != 'B'\t %b%n", 'A'+1 != 'B');
    }
}
