public class JJ06_15 {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
    static int factorial(int n){
        if(n<=0||n>12) return -1; //재귀호출은 스택 오버플로우 발생할 수 있음. 반복문은 속도 빠르고 오버플로우도x
        return (n!=1)? n*factorial(n-1) : 1;
    }
}