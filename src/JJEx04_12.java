public class JJEx04_12 {
    /*구구단 출력*/
    public static void main(String[] args) {
        for (int k = 0; k < 3; k++) {
            for (int i = 1; i <= 3; i++) {
                for (int j = 2; j <= 4; j++) {
                    System.out.print(j + (k * 3) + "*" + i + "=" + (j + (k * 3))*i);
                    if (j == 4) {
                        System.out.println();
                    } else if (j == 3 && (j + (k * 3) == 9)) {
                        System.out.println();
                        break;
                    } else System.out.print("\t");
                }
            }
            if (k < 2) {
                System.out.println();
            }
        }
    }
}
