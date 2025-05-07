import java.util.*;

public class JJ10_02 {
    public static void main(String[] args) {
        final String[] DAY_OF_WEEK = {"","일","월","화","수","목","금","토"};

        Calendar date1 = Calendar.getInstance();
        Calendar date2 = Calendar.getInstance();

        date1.set(2015, 7, 15); //7==Calendar.AUGUST
        System.out.println("date1은 "+ toString(date1));
    }
    public static String toString(Calendar date){
        return date.get(Calendar.YEAR)+"년"+(date.get(Calendar.MONTH)+1)+"월"+date.get(Calendar.DATE)+"일";
    }
}
