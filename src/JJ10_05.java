import java.util.*;

public class JJ10_05 {
    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();

        date.set(2015,0,31);
        System.out.println(toString(date));
        date.add(Calendar.MONTH,1);
        System.out.println(toString(date));
    }
    public static String toString(Calendar date){
        return date.get(Calendar.YEAR)+"년 "+(date.get(Calendar.MONTH)+1)+"월 "+date.get(Calendar.DATE)+"일";

    }

}
