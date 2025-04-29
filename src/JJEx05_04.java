public class JJEx05_04 {
    /*2차원 배열 arr의 값의 총합과 평균*/
    public static void main(String[] args) {
        int[][] arr={
                {5,5,5,5,5},
                {10,10,10,10,10},
                {20,20,20,20,20},
                {30,30,30,30,30}
        };
        int total =0 ;
        float average =0;

        for(int i=0; i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                total += arr[i][j];
            }
            average=(float)total/(arr[0].length * arr.length);
        }

        System.out.println("total="+total);
        System.out.println("average="+average);
    }
}
