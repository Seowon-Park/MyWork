public class HW05_01 {
    /*1~9의 숫자 세자리로 이루어진 2개의 배열을 비교해서
    숫자 동일, 위치 동일x => b++, 숫자 동일, 위치 동일o => s++
    결과를 출력하세요.<야구게임>
    예시) 1S2B */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] arr2 = {1, 3, 2};
        int s=0;
        int b=0;

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(arr[i]==arr2[j]) {
                    if(i==j){s++;}
                    else{b++;}
                }
            }
        }
        System.out.println(s+"S"+b+"b");
    }
}
