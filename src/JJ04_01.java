public class JJ04_01 {
    public static void main(String[] args) {
        int x = 0;
        System.out.printf("X=%d 일 때, 참인 것은%n", x);

        if(x==0) System.out.println("X==0");
        if(x!=0) System.out.println("X!=0");
        if(!(x==0)) System.out.println("!(X==0)");
        if(!(x!=0)) System.out.println("!(X!=0)");

        x=1;
        System.out.printf("x=%d 일 때, 참인 것은 %n",x);

        if(x==0) System.out.println("X==0");
        if(x!=0) System.out.println("X!=0");
        if(!(x==0)) System.out.println("!(X==0)");
        if(!(x!=0)) System.out.println("!(X!=0)");

    }
}
