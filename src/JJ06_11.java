public class JJ06_11 {
    public static void main(String[] args) {
        int[]  x = new int[10];
        System.out.println("main(): x = " + x[0]);

        change(x);
        System. out. println("After change(x)");
        System.out.println("main(): x = "+x[0]);
    }
    static void change(int[] x){
        x[0]=100;
        System.out.println("change() : x = "+ x[0]);
    }
}
