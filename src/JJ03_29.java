import static java.lang.Long.toBinaryString;

public class JJ03_29 {
    public static void main(String[] args) {
        byte p = 10;
        byte n = -10;

        System.out.printf(" p =%d \t\t%s%n", p, toBinaryString(p));
        System.out.printf(" ~p =%d \t%s%n", ~p, toBinaryString(~p));
        System.out.printf(" ~p+1 =%d \t%s%n", ~p+1, toBinaryString(~p+1));
        System.out.printf(" ~~p =%d \t%s%n", ~~p, toBinaryString(~~p));
        System.out.println();
        System.out.printf(" n =%d%n", n);
        System.out.printf(" ~(n+1) =%d%n", ~(n+1));
    }
    static String toBinaryString(int x){
        String zero = "00000000000000000000000000000000";
        String tmp = zero + Integer.toBinaryString(x);
        return tmp.substring(tmp.length()-32);//맨 끝 32자리만 잘라서 반환
    }
}

