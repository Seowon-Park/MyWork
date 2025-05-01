import java.util.*;
import static java.util.Objects.*;

public class JJ09_26 {
    public static void main(String[] args) {
        String[][] str2D = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};
        String[][] str2D2 = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};

        System.out.print("str2D ={");
        for(String[] tmp:str2D) System.out.print(Arrays.toString(tmp));
        System.out.println("}");

        System.out.print("str2D+2={");
        for(String[] tmp:str2D2) System.out.print(Arrays.toString(tmp));
        System.out.println("}");

        System.out.println("equals"+Objects.equals(str2D,str2D2));
        System.out.println("deepEquals"+Objects.deepEquals(str2D,str2D2));

        System.out.println("isNull(null)="+isNull(null));
        System.out.println("isNull(null)="+nonNull(null));
        System.out.println("hashCode(null)="+Objects.hashCode(null));
        System.out.println("toString(null)="+Objects.toString(null));
        System.out.println("toString(null,\"\")="+Objects.toString(null,""));

        Comparator c = String.CASE_INSENSITIVE_ORDER;
        System.out.println("compare(aa,bb)="+compare("aa","bb",c));
        System.out.println("compare(bb,aa)="+compare("bb","aa",c));
        System.out.println("compare(ab,AB)="+compare("ab","AB",c));
    }
}
