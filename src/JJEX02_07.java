public class JJEX02_07 {
    public static void main(String[] args) {
        char ch = 'A';
        int code = (char)ch;

        System.out.printf("%c=%d(%#x)%n",ch ,code,code);

        char hch = '가';
        System.out.printf("%c=%d(%#x)%n",hch,(int)hch,(int)hch);
    }
}
