//import java.util.Scanner;
//import java.io.File;
//
//public class JJ09_37 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(new File("data3.txt"));
//
//        int cnt = 0;
//        int totalSum = 0;
//
//        while(sc.hasNextLine()){
//            String line = sc.nextLine();
//            Scanner sc2 = new Scanner(line).useDelimiter(",");
//            int sum = 0;
//
//            while(sc2.hasNextLine()){
//                sum += sc2.nextInt();
//            }
//            System.out.println(line+", sum="+sum);
//            totalSum += sum;
//            cnt++;
//        }
//        System.out.println("Line: "+cnt+", Total: "+totalSum);
//    }
//}
