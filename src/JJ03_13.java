public class JJ03_13 {
    public static void main(String[] args) {
        char c1 = 'a';

        char c2 = (char)(c1+1);
        char c3 = 'a'+1; // 이건 컴파일러가 계산해줌

        System.out.println(c2);
        System.out.println(c3);
    }
}
