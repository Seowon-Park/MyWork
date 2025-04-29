public class JJ03_22 {
    public static void main(String[] args) {
        float f = 0.1f;
        double d = 0.1;
        double d2 = (double)f;

        System.out.printf("10.0==10.0f\t %b%n", 10.0==10.0f); //true => 10은 명확한 수라서 오차 없음
        System.out.printf("0.1==0.1f\t %b%n", 0.1==0.1f); //true X => 2진수로 변환하는 과정에서 오차발생
        System.out.printf("f=%19.17f\t%n", f);
        System.out.printf("d=%19.17f\t%n", d);
        System.out.printf("d2=%19.17f\t%n", d2);
        System.out.printf("d==f\t %b%n", d==f); //false
        System.out.printf("d==d2\t %b%n", d==d2); // true X
        System.out.printf("d2==f\t %b%n", d2==f); // true
        System.out.printf("(float)d==f\t %b%n", (float)d==f); //true
    }
}
