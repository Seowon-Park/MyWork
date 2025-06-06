import static java.lang.Math.*;
import static java.lang.System.*;

public class JJ09_20 {
    public static void main(String[] args) {
        double val = 90.7552;

        out.println("roun("+val+")="+round(val));

        val*=100;
        out.println("roun("+val+")/100="+round(val)/100);
        out.println("roun("+val+")/100.0="+round(val)/100.0);
        out.println();
        out.printf("ceil(%3.1f)=%3.1f%n",1.1,ceil(1.1));
        out.printf("floor(%3.1f)=%3.1f%n",1.5,floor(1.5));
        out.printf("round(%3.1f)=%d%n",1.1,round(1.1));
        out.printf("round(%3.1f)=%d%n",1.5,round(1.5));
        out.printf("rint(%3.1f)=%f%n",1.5,rint(1.5));
        out.printf("round(%3.1f)=%d%n",-1.5,round(-1.5));
        out.printf("rint(%3.1f)=%f%n",-1.5,rint(-1.5));
        out.printf("ceil(%3.1f)=%f%n",-1.5,ceil(-1.5));
        out.printf("floor(%3.1f)=%f%n",-1.5,floor(-1.5));

        long l4 = Math.round(-3.5);
        out.println(l4);
        double l5 = Math.rint(-3.5);
        out.println(l5);
    }
}
