import java.util.*;

public class HW01_07 {
    public static void main(String[] args){
        for(int i=1;i<=5;i++) {
            for(int k=1;k<=4;k++){
                System.out.print('*');
            }
            for(int j=1;j<i;j++){
                System.out.print('*');
            }
            System.out.println('*');
        }
    }
}