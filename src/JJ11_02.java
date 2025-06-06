import java.util.*;

public class JJ11_02 {
    public static void main(String[] args) {
        final int LIMIT=10;
        String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
        int length = source.length();

        List list = new ArrayList(length/LIMIT+10);

        for(int i=0 ; i<length ; i+=LIMIT){
            if(i+LIMIT<length)
                list.add(source.substring(i,i+LIMIT));
            else
                list.add(source.substring(i)); //i부터 인덱스 끝까지
        }
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
