public class JJEx03_10 {
    /*대문자를 소문자로 변경하는 코드*/
    public static void main(String[] args) {
        char ch='A';

        char lowerCase = (ch<97)?(char)(ch+32):ch;

        System.out.println("ch:"+ch);
        System.out.println("ch to lower case: "+lowerCase);
    }
}
