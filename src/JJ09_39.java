import java.util.*;

public class JJ09_39 {
    public static void main(String[] args) {
        String expression = "x=100*(200+300)/2";
        StringTokenizer st = new StringTokenizer(expression,"+-*/=()",true);
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
