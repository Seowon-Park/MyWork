public class HW06_02 {
    /*5*5배열의 2차원 배열을 받아서 빙고의 갯수를 반환하는 메서드 bingoCnt를 작성*/
    public static void main(String[] args) {
        int[][] arr={
                {0,0,0,0,1},
                {1,1,1,1,1},
                {1,1,1,1,1},
                {0,0,0,0,1},
                {0,0,0,0,1}
        };
        System.out.println(bingoCnt(arr));
    }
    static int bingoCnt(int[][] arr){
        int cnt=0;
        int[] checkL= {0,0,0,0,0};
        for(int i=0;i<arr.length;i++){
            int check=0;
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==1) {check++; checkL[j]++;}
            }
            if(check==5) cnt++;
        }
        for(int chk:checkL){
            if(chk==5) cnt++;
        }
        return cnt;
    }
}
