import java.util.regex.*;

public class JJ09_31 {
    public static void main(String[] args) {
        String[] data = {"bat","baby","bonus","cA","ca", "co", "c.","c0","car","combat","count","date","disc"};
        Pattern p = Pattern.compile("c[a-z]*");

        for(int i=0; i<data.length; i++){
            Matcher m = p.matcher(data[i]);
            if(m.matches()) System.out.println(data[i]+",");
        }
    }
}
