/*2진수 변환*/
import java.util.ArrayList;
import java.util.Collections;

public class Java200_052 {
    public static void main(String[] args) {
//        int num=4;
//        ArrayList<Integer> binary=new ArrayList<>();
//        while(num!=0){
//            binary.add(num%2);
//            num/=2;
//        }
//        Collections.reverse(binary);
//        for(int bi:binary){
//            System.out.print(bi);
//        }
        int a=8;
        int t =0;
        String str ="";
        while(a!=0){
            t=a%2;
            str = t+ str;
            a=a/2;
        }
        t=a%2;
        str=t+str;
        System.out.println(str);
    }
}
