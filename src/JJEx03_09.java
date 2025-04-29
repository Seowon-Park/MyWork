public class JJEx03_09 {
    /*문자형 변수 ch가 영문자(대문자or소문자)이거나 숫자일 때만 변수 b의 값이 true가 되도록 한다*/
    public static void main(String[] args) {
        char ch='z';
        boolean b=(65<=ch&&ch<=90||97<=ch&&ch<=122||48<=ch&&ch<=57);
        System.out.println(b);
    }
}
