/*역삼각형 만들기*/
public class Java200_121 {
    public static void main(String[] args) {
        gettri(10);
    }
   static void gettri(int num) {
       for (int i = 0; i < num; i++) {
           for (int j = 0; j < i; j++) {
               System.out.print(" ");
           }
           for (int j = num - i * 2; j > 0; j--) {
               System.out.print("*");
           }
           System.out.println();
       }
   }
}