import static java.lang.Math.*;
import static java.lang.System.*;

public class JJ09_21 {
    public static void main(String[] args) {
        int i = Integer.MIN_VALUE;

        out.println("i="+i);
        out.println("-i="+(~i+1));

        try{
            out.printf("negateExact(%d)=%d%n",10,negateExact(10));
            out.printf("negateExact(%d)=%d%n",-10,negateExact(-10));
            out.printf("negateExact(%d)=%d%n",i,negateExact(i));
        }catch(ArithmeticException e){
            out.printf("negateExact(%d)=%d%n",(long)i,negateExact((long)i));
        }
    }
}
