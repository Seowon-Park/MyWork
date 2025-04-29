import java.util.*;

public class JJEX02_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("두자리 정수를 입력: ");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);
//        int num = scanner.nextInt();

        System.out.println("입력 내용:"+input);
        System.out.printf("num=%d%n", num);
    }
}
