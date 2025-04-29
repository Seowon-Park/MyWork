import java.util.*;

public class JOP01_03 {
    public static void main(String[] args) {
        int[][] sScore= new int[2][5];

        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<sScore[0].length; i++){
            for(int j=0; j<sScore.length; j++){
                System.out.printf("%d번째 학생의 %s 성적: ",i+1,(j==0)?"국어":"수학");
                sScore[j][i]=scanner.nextInt();
            }
        }

        for(int i=0; i<sScore.length; i++){
            int high = sScore[i][0];
            int low = sScore[i][0];
            int sum = 0;
            for(int j=0; j<sScore[0].length; j++){
                if(high < sScore[i][j]) high=sScore[i][j];
                if(low > sScore[i][j]) low=sScore[i][j];
                sum += sScore[i][j];
            }
            System.out.println();
            System.out.printf("%s 최고 점수: %d%n",(i==0)?"국어":"수학",high);
            System.out.printf("%s 최저 점수: %d%n",(i==0)?"국어":"수학",low);
            System.out.printf("%s 총점: %d%n",(i==0)?"국어":"수학",sum);
            System.out.printf("%s 평균: %.2f%n",(i==0)?"국어":"수학",(float)sum/sScore[0].length);
        }

    }
}

