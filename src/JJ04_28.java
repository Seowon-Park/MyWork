import java.util.*;

public class JJ04_28 {
    public static void main(String[] args) {
        int input = 0, answer =0;

        answer = (int)(Math.random()*100)+1;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.print("1과 100사이의 정수를 입력하세요.: ");
            input = scanner.nextInt();

            if(input>answer) System.out.println("더 작은 수로 다시 시도 plz");
            else if(input<answer) System.out.println("더 큰 수로 다시 시도 plz");
        }while(input != answer);
        System.out.println("정답입니다.");
    }
}
