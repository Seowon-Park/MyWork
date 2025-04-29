/*
[스터디]
교재: 자바객체지향프로그래밍입문
1장 연습문제4
*/
import java.util.*;

public class JOPEX01_04 {
    public static void main(String[] args) {
        int total=0;
        float avg=0;
        int sScore=0;

        System.out.print("학생 수를 입력하세요: ");
        Scanner scanner = new Scanner(System.in);
        int sNum=scanner.nextInt();

        int[] sArr = new int[sNum];

        System.out.print("학생 점수를 입력하세요: ");
        for(int i=0; i<sArr.length; i++){
            sArr[i]=scanner.nextInt();
            total += sScore;
        }

        avg=(float)total/sNum;
        System.out.println("평균"+avg);

        for(int i=0; i<sArr.length; i++){
            System.out.printf("%d %s%n",sArr[i], (sArr[i]>=avg)? "pass!":"fail!");
        }

    }
}
