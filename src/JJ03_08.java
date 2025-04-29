public class JJ03_08 {
    public static void main(String[] args) {
        int a = 1_000_000;
        int b = 2_000_000;

        long c = (long)a*b; // a*b 부분이 int이니까 이 시점에서 비트가 탈락됨
        System.out.println(c);
    }
}
