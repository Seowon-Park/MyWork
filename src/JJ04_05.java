import java.util.*;

public class JJ04_05 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ', opt = '0';

        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        System.out.printf("당신의 점수는 %d입니다.", score);

        if(score>=90){
            grade='A';
            if(score>=98) opt='+';
            else if(score<94) opt='-';
        }else if(score>=80){
            grade='B';
            if(score>=88) opt='+';
            else if(score<84) opt='-';
        }else{grade='C';}
        System.out.printf("당신의 학점은 %c%c입니다.",grade,opt);
    }
}
