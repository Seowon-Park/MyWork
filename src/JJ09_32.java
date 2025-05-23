import java.util.Arrays;
import java.util.regex.*;

public class JJ09_32 {
    public static void main(String[] args) {
        String[] data = {"bat","baby","bonus","c","cA","ca", "co", "c.","c#","c0","car","combat","count","date","disc"};
        String[] pattern = {".*","c[a-z]*","c[a-z]","c[a-zA-z]","c[a-zA-z0-9]", "c.", "c.*","c\\.","c\\w","c\\d","c.*t","[^b|c].*",".*a.*",".*a.+","[b|c].{2}"};

        System.out.println(Arrays.toString(data));
        for(int x=0; x<pattern.length;x++){
            Pattern p=Pattern.compile(pattern[x]);
            System.out.print("Pattern:"+pattern[x]+" 결과: ");
            for(int i=0; i<data.length; i++){
                Matcher m =p.matcher(data[i]);
                if(m.matches()) System.out.print(data[i]+",");
            }
            System.out.println();
        }
    }
}
