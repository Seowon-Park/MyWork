public class JJ08_02 {
    public static void main(String[] args) {
        int number = 10;
        int result =0;

        for(int i=0; i<10; i++){
            try{
                result = number/(int)(Math.random()*10);
            } catch(ArithmeticException e){
                System.out.println(0);
            }
            System.out.println(result);
        }
    }
}
