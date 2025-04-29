import java.util.Arrays;

public class HW05_02 {
    /*아래 배열(1~9)에서 카운팅을 이용하여
     1. 중복제거: [1,2,3,4,5,6]
     2. 정렬: [1,1,2,2,2,3,3,4,5,5,6]
     위의 결과를 출력하세요.*/
    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 1, 2, 5, 1, 2, 3, 2, 5};
        int[] cnt = new int[9];
        int[] num = new int[9];

        for (int i = 0; i < arr.length; i++) {
            cnt[arr[i] - 1]++;
        }

        System.out.print("1. 중복제거:");
        for (int i = 0; i < num.length; i++) {
            if (cnt[i] != 0) {num[i] = i + 1;}

            if(num[i]!=0) System.out.print(num[i]);
            if(cnt[i+1] != 0) System.out.print(",");
            else {System.out.println(); break;}
        }

        System.out.print("2. 정렬:");
        for (int i = 0; i < num.length; i++) {
            for(int j=0; j<cnt[i];j++){
                System.out.print(i+1);
                if(cnt[i+1] != 0) System.out.print(",");
                else System.out.print(" ");
            }
        }

    }
}

