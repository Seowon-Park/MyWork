public class JJEx04_09 {
    /*숫자로 이루어진 문자열의 각 자라의 합*/
    public static void main(String[] args) {
        String str = "12345";
        int sum = 0;

        for(int i=0;i<str.length();i++){
            int num = str.charAt(i);
            sum += num -48;
        }
        System.out.println("sum="+sum);
    }
}
