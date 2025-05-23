public class JJ06_16 {

    static long facotrial(int n){
        if(n<=0||20<n) return -1;
        return (n>1)?n*facotrial(n-1): 1;
    }

    public static void main(String[] args) {
        int n = 21;
        long result = 0;

        for(int i = 1; i <= n; i++){
            result = facotrial(i);
            if(result == -1){
                System.out.printf("유효하지 않은 값입니다.(0<n<=20): %d%n",n);
                break;
            }
            System.out.printf("%2d!=%20d%n",i,result);
        }
    }
}
