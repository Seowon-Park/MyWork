//import java.util.Scanner;
//
///*
//[스터디]
//교재: 자바객체지향프로그래밍입문
//1장 연습문제5
//*/
//public class JOPEX01_05 {
//    public static void main(String[] args) {
//        int[][] sArr = new int[5][2];
//        int[][] score = new int[2][3];
//        float[][] avg = new float[2][1];
//
//
//        int highS = 0;
//        int lowS = 0;
//        int totalS = 0;
//        float avgS = 0;
//
//        System.out.print("학생 점수를 입력하세요: ");
//        Scanner scanner = new Scanner(System.in);
//        for(int i=0; i<sArr.length; i++){
//            for(int j=0; j<sArr[i].length; j++){
//                System.out.printf("%d번째 학생의 %s 점수를 입력하세요: ",i+1,(j==0)?"국어":"수학");
//                sArr[i][j]= scanner.nextInt();
//            }
//        } // 학생 클래스(추상클래스: 점수 입력 있음)
//
//        for(int i=0; i<sArr[0].length; i++){
//            highS=sArr[0][i];
//            lowS=sArr[0][i];
//            for(int j=0; j<sArr.length; j++){
//                if(highS<sArr[j][i]) highS=sArr[j][i];
//                if(lowS<sArr[j][i]) lowS=sArr[j][i];
//                totalS += sArr[j][i];
//            }
//            avgS =(float)totalS/sArr.length;
//            System.out.printf("%s 최고 점수: %d%n",(i==0)?"국어":"수학",highS);
//            System.out.printf("%s 최저 점수: %d%n",(i==0)?"국어":"수학",lowS);
//            System.out.printf("%s 총점: %d%n",(i==0)?"국어":"수학",totalS);
//            System.out.printf("%s 평균: %f%n",(i==0)?"국어":"수학",avgS);
//            System.out.println();
//        }
//        //과목 클래스(하위-국어,수학 / 추상 메소드 -> 최고점수(계산+출력), 최저점수(계산+출력), 총점(계산+출력), 평균(계산+출력) => 전체 출력)
//
//        for()
//
//    }
//}
