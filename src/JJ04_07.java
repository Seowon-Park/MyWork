import java.util.*;

public class JJ04_07 {
    public static void main(String[] args) {
        System.out.print("1. 가위 2. 바위 3. 보 중 하나를 입력하세요.: ");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int com = (int)(Math.random()*3)+1;

        switch(input-com){
            case 0: System.out.print("비겼습니다."); break;
            case 1: case -2: System.out.print("당신이 이겼습니다."); break;
            case 2: case -1: System.out.print("당신이 졌습니다."); break;
        }

    }
}
