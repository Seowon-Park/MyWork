public class JJEx04_13 {
    /*주어진 문자열이 숫자인지 판별*/
    public static void main(String[] args) {
        String value ="12o45";
        char ch = ' ';
        boolean isNumber = true;

        for(int i=0;i<value.length();i++){
            ch=value.charAt(i);
            if(!(48<=ch&&ch<=57)){
                isNumber=false;
                break;
            }

        }

        if(isNumber){System.out.println("숫자입니다");}
        else{System.out.println("숫자가 아닙니다.");}

    }
}
