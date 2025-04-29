public class JJ05_17 {
    public static void main(String[] args) {
        if(args.length !=3){
            System.out.println("usage: java JJ05_17 num1 op num2");
            System.exit(0);
        }
        int num1 = Integer.parseInt(args[0]); //문자열->숫자
        char op = args[1].charAt(0); //문자열->문자
        int num2 = Integer.parseInt(args[2]);
        int result = 0;

        switch(op){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case 'x':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("지원되지 않은 연산입니다.");
        }
        System.out.println("결과: "+result);
    }
}
