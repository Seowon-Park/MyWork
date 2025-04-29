public class JJEx06_22 {
    public static void main(String[] args) {
        String str ="123";
        System.out.println(str+"는 숫자입니까?"+isNumber(str));
        str="1234o";
        System.out.println(str+"는 숫자입니까?"+isNumber(str));
    }
    static boolean isNumber(String str){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)<'0' || '9'<str.charAt(i)){return false;}
        }
        return true;
    }
}
