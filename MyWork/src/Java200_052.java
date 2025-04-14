/*2진수 변환*/
import java.util.ArrayList;
import java.util.Collections;

public class Java200_052 {
    public static void main(String[] args) {
        int num=4;
        ArrayList<Integer> binary=new ArrayList<>();
        while(num!=0){
            binary.add(num%2);
            num/=2;
        }
        Collections.reverse(binary);
        for(int bi:binary){
            System.out.print(bi);
        }
    }
}
