import java.util.Scanner;

public class JJ03_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = ' ';

        System.out.print("문자를 하나 입력하세요: ");
        String str = scanner.nextLine();
        ch = str.charAt(0);

        if('0'<=ch && ch<='9'){
            System.out.println("입력하신 문자는 숫자입니다.");
        }
        if(('a'<=ch && ch<='z')||('A'<=ch && ch<='Z')){
            System.out.println("입력하신 문자는 영문자입니다.");
        }

    }
}
