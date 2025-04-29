import java.util.*;

public class JOP01_02 {
    public static void main(String[] args) {
        int ia, ib;
        float fa,fb;
        String sa, sb;
        int[] iArr= new int[5];
        int Min;

        Scanner scanner = new Scanner(System.in);

        System.out.print("두 개의 정수를 입력하세요: ");
        ia = scanner.nextInt();
        ib = scanner.nextInt();
        System.out.printf("최소값은 %d입니다.%n", (ia<=ib) ? ia:ib);

        System.out.print("두 개의 실수를 입력하세요: ");
        fa = scanner.nextFloat();
        fb = scanner.nextFloat();
        System.out.printf("최소값은 %.1f입니다.%n", (fa<=fb) ? fa:fb);

        System.out.print("두 개의 문자열를 입력하세요: ");
        sa = scanner.next(); //하나의 문자열 추출은 next()
        sb = scanner.next();
        System.out.printf("최소값은 %s입니다.%n", (sa.compareTo(sb)<0)?sa:sb); // 문자열 비교는 compareTo

        System.out.print("정수 배열 5개: ");
        for(int i=0; i<iArr.length; i++) iArr[i] = scanner.nextInt();
        Min = iArr[0];
        for(int i=0; i<iArr.length; i++) Min=(Min>iArr[i])? iArr[i]:Min;
        System.out.printf("최소값은 %d입니다.%n", Min);

    }
}
