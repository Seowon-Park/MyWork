public class HW05_03 {
    public static void main(String[] args) {
        System.out.println("i\t1번\t2번\t3번\t4번\t5번\t6번");
        for(int i=0;i<9;i+=3){
            for(int j=1;j<=3;j++) {
                System.out.print(j+i + "\t");
                System.out.print((10 -(j+i) + "\t"));
                System.out.print("헬로");
                System.out.print(((j+i) * 2) + "\t");
                System.out.print((2 * (j+i) - 1) + "\t");
                System.out.print(((j+i) * (j+i)) + "\t");
                System.out.print(j + "\t");
                System.out.print(((j+i) + 2) / 3);
                System.out.println();
            }
        }

    }
}
