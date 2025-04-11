public class JJEx04_12 {
    /*구구단 출력*/
    public static void main(String[] args) {
        /*
        for (int k = 0; k < 3; k++) { //k+=3으로하고
            for (int i = 1; i <= 3; i++) {
                for (int j = 2; j <= 4; j++) {
                    System.out.print(j + (k * 3) + "*" + i + "=" + (j + (k * 3))*i);
                    if (j == 4) { //식 출력하기 전에 if(i+k < 10) 붙이면 되는 걸 어렵게 돌아갔다..
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
         */
        /*
        for(int k=0;k<3;k++){
            for(int i=1;i<=3;i++){
                for(int j=2;j<=4;j++){
                    if((j+(k*3))<10) {
                        System.out.print(j + (k * 3) + "*" + i + "=" + (j + (k * 3)) * i);
                        System.out.print("\t");
                    }
                }
                System.out.println();
                if(i%3==0){System.out.println();}
            }
        }
         */
                for (int i = 1; i <= 9; i++) {
                    for (int j = 2; j <= 4; j++) {
                        int k = j;
                        if (i > 6)
                            k += 6;
                        else if (i > 3)
                            k += 3;
                        if (k < 10)
                            System.out.print(k + "*" + ((i - 1) % 3 + 1) + "=" + k * ((i - 1) % 3 + 1) + "\t\t");
                    }
                    if (i % 3 == 0) {
                        System.out.println();
                    }
                    System.out.println();
                }
        for(int i=1;i<8;i+=3){
            for(int j=1;j<=3;j++){
                if(j+2<10){
                    System.out.print((j+1) + "*" + i + "=" + i * (j+1));
                    System.out.print("\t");
                }
                System.out.println();
                if(i%3==0){System.out.println();
            }
            }
        }
    }
}
