/*피보나치수열*/
public class JJEx04_11 {
    public static void main(String[] args){
        int num1 = 1;
        int num2 = 1;
        int num3 = 0;
        System.out.print(num1+","+num2);

        for(int i=0; i<8; i++){
            System.out.print(",");
            num3 = num1 + num2;
            System.out.print(num3);
            num1=num2;
            num2=num3;
        }
    }
}
