import static java.lang.Long.toBinaryString;

public class JJ03_28 {
    public static void main(String[] args) {
        int x = 0xAB, y =0xF;

        System.out.printf("x=%#x \t\t\t%s%n", x, toBinaryString(x));
        System.out.printf("y=%#x \t\t\t\t%s%n", y, toBinaryString(y));
        System.out.printf("%#x|%#x=%#x\t%s%n", x,y,x|y, toBinaryString(x|y));
        System.out.printf("%#x&%#x=%#x\t\t%s%n", x,y,x&y, toBinaryString(x&y));
        System.out.printf("%#x^%#x=%#x\t%s%n", x,y,x^y, toBinaryString(x^y));
        System.out.printf("%#x^%#x=%#x\t%s%n", x^y,y,x^y^y, toBinaryString(x^y^y));
    }
}
