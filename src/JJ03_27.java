public class JJ03_27 {
    public static void main(String[] args) {
        boolean b = true;
        char ch = 'C';

        System.out.printf("b=%b%n", b);
        System.out.printf("!b=%b%n", !b);
        System.out.printf("!!b=%b%n", !!b);
        System.out.printf("!!!b=%b%n", !!!b);
        System.out.println();

        System.out.printf("ch=%c%n", ch);
        System.out.printf("ch<'a'||'z'<ch => %b%n", ch<'a'||'z'<ch);
        System.out.printf("!('a'<ch&&ch<'z') => %b%n", !('a'<ch&&ch<'z'));
        System.out.printf("'a'<ch&&ch<'z' => %b%n", 'a'<ch&&ch<'z');
    }
}
