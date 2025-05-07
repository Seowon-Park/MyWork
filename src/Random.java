import java.util.*;

public class Random {
    public static void main(String[] args) {
        String[] family = {"엄마","아빠","언니","오빠","나"};
        int i=11;

        System.out.println("추첨시작");

        while(--i!=0){
            for(long j=0L;j<2_000_000_000L;j++);
            System.out.println("카운트 다운"+i);
        }

        Scanner input = new Scanner(System.in);
        System.out.print("결과 확인! 아무키를 눌러주세요");

        String a=input.nextLine();
        try {
            int A = Integer.parseInt(a);
        }catch(Exception e){}

        int z = (int)(Math.random()*10)+1;
        System.out.println(family[z]);

//        for(int i=0 ; i<10 ; i++){
//            System.out.print(getRand(5,10)+",");
//        }
//        System.out.println();
//
//        int[] result = fillRand(new int[10], new int[]{2,3,7,5});
//
//        System.out.println(Arrays.toString(result));
//
//    }
//
//    public static int[] fillRand(int[] arr, int from, int to){
//        for(int i=0; i<arr.length; i++) arr[i]=getRand(from, to);
//        return arr;
//    }
//    public static int[] fillRand(int[] arr, int[] data){
//        for(int i=0;i<arr.length;i++){
//            arr[i]=data[getRand(0,data.length-1)];
//        }
//        return arr;
//    }
//    public static int getRand(int from, int to){
//        return (int)(Math.random()*(Math.abs(to-from)+1))+Math.min(from,to);

    }
}
