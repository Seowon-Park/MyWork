//import java.util.*;
//
//public class JJ09_28 {
//    public static void main(String[] args) {
//        Random rand = new Random();
//        int[] number = new int[100];
//        int[] counter = new int[100];
//
//        for(int i=0; i<number.length; i++){
//            System.out.print(number[i]= rand.nextInt(10));
//        }
//        System.out.println();
//
//        for(int i=0; i<number.length ; i++){
//            counter[number[i]]++;
//        }
//        for(int i=0; i<counter.length; i++){
//            System.out.println(i+"의 개수: "+printGraph('#',counter[i])+" "+counter[i]);
//        }
//    }
//
//    public static String printGraph(char c, int i) {
//        char[] bar = new char[i];
//
//        for(int j=0 ; j<bar.length ; j++){
//            bar[j]=c;
//        }
//        return new String(bar);
//    }
//}
