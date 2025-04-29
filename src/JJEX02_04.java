import static java.lang.System.out;

public class JJEX02_04 {
    public static void main(String[] args) {
        byte b = 1;
        short s = 2;
        char c = 'A';

        int finger = 10;
        long big = 100_000_000_000L;
        long hex = 0xFFFF_FFFF_FFFF_FFFFL;

        int octNum = 010;
        int hexNum = 0x10;
        int binNum = 0b10;

        out.printf("b=%d%n",b);
        out.printf("s=%d%n", s);
        out.printf("c=%c, %d%n",c,(int)c);
        out.printf("finger=[%5d]%n",finger);
        out.printf("finger=[%-5d]%n", finger);
        out.printf("finger=[%05d]%n", finger);
        out.printf("big=%d%n",big);
        out.printf("hex=%#x%n",hex);
        out.printf("octNum=%o, %d%n",octNum,octNum);
        out.printf("hexNum=%x, %d%n",hexNum,hexNum);
        out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);


    }
}
