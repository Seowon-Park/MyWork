/*얼마의 수까지 더해야 100을 넘지 않는지*/
public class JJ04_26 {
    public static void main(String[] args) {
        int sum = 0;
        int i =0;

        while((sum+=++i)<100){
            System.out.printf("%d-%d%n",i,sum);
        }
    }
}
