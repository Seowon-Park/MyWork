import java.util.*;

public class HW01_02 {
    /*배열로 하면 더 쉽게 풀 수 있다 => 다른 문제들도 배열로 생각을 해보자..!*/
    public static void main(String[] args){
        for(int i=1;i<=5;i++) {
            System.out.println('*');
            for(int j=1;j<=i;j++){
                System.out.print(' ');
            }
        }
    }
}
