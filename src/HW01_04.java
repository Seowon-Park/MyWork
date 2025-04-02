import java.util.*;

public class HW01_04 {
    public static void main(String[] args){
        for(int i=1;i<=5;i++) {
            if(i!=1&&i!=5) {
                for (int j=1; j <=(i%2)+1; j++) {
                    System.out.print(' ');
                }
            }
            if(i!=3){
                System.out.print('*');
                System.out.print(' ');
            }
            if(i%2==1&&i!=3) {
                for (int j=1; j<=(i%2)+1; j++) {
                    System.out.print(' ');
                }
            }
            System.out.println('*');
        }
    }
}