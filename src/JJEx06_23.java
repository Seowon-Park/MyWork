public class JJEx06_23 {
    public static void main(String[] args) {
        int[] data= {3,2,9,4,7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값:"+max(data));
        System.out.println("최대값:"+max(null));
        System.out.println("최대값:"+max(new int[]{}));
    }
    static int max(int[] arr){
        int max =-999999;
        if (arr == null) return max;
        for(int check:arr){
            if(max<check) max=check;
        }
        return max;
    }
}
