public class JOP01_04 {//윈도우 콘솔 창에서 입력 가능. 인텔리제이 콘솔창은 어케 사용하징?
    public static void main(String[] args) {
        int sum=0;
        for(String arg: args){
            sum += Integer.parseInt(arg);
        }
        System.out.println(sum);
    }
}
