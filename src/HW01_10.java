import java.util.*;

public class HW01_10 {
    public static void main(String[] args){
        int dot=0;
        int spc=0;

        for(int i=1; i<=5; i++){
            if(i%2==1){spc=3; dot=1;}
            else{spc=1; dot=2;}
            for(int j=1;j<=dot;j++){
                System.out.print('*');
            }
            for(int j=1;j<=spc;j++){
                if(i==3){System.out.print('*');}
                else{System.out.print(' ');}
            }
            for(int j=1;j<=dot;j++){
                System.out.print('*');
            }
            System.out.println();

        }

    }
}