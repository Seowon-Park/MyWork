import java.util.*;
import java.text.*;

public class JJ10_13 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2005,9,3);

        Date day = cal.getTime();

        SimpleDateFormat sdf1, sdf2, sdf3, sdf4;
        sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        sdf2 = new SimpleDateFormat("yy-MM-dd E요일");
    }
}
