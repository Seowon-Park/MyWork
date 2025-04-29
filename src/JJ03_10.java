public class JJ03_10 {
    public static void main(String[] args) {
        int a = 1000000;

        int result1 = a*a/a; //먼저 곱하니까 int 범위 벗어남
        int result2 = a/a*a;

        System.out.println(result1);
        System.out.println(result2);
    }
}
