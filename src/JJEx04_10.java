public class JJEx04_10 {
    /*숫자의 각자리의 합을 더한 결과. 문자열로 변환x*/
    public static void main(String[] args) {
        int num =12345;
        int sum =0;

        int cnt=num;
        int flag=0;
        while(cnt!=0) {
            cnt /= 10;
            flag++;
        }
        for(int i=1;i<=flag;i++){
            sum+=num%10;
            num/=10;
        }
        System.out.println("sum="+sum);
    }
}

