import java.util.Arrays;

public class JJ06_12 {
    public static void main(String[] args) {
        int[] arr = new int[]{3,2,1,6,5,4};

        printArr(arr);
        sortArr(arr);
        printArr(arr);
        System.out.println("sum = "+sumArr(arr));

    }
    static void printArr(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
    static int sumArr(int[] arr){
        int sum = 0;
        for(int num:arr){
            sum += num;
        }
        return sum;
    }
    static void sortArr(int[] arr){
        int swp =0;
        for(int j = 0; j<arr.length-1;j++)
for(int i =0 ;i<arr.length-1;i++){
if(arr[i]>arr[i+1]){
swp=arr[i];
arr[i]=arr[i+1];
arr[i+1]=swp;
}
        }
    }
}
