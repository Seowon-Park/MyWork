import java.util.*;

public class JOP01_01 {
    public static void main(String[] args) {
                String name;
                String year;

                Scanner scanner = new Scanner(System.in);

                System.out.print("이름을 입력하세요: ");
                name = scanner.nextLine();
                System.out.print("현재 연도를 입력하세요: ");
                year = scanner.nextLine();
                System.out.printf("Hello %s%n",name);
                System.out.printf("Good Luck in %s",year);

    }
}
