public class JJ04_19 {
    public static void main(String[] args) {
        for(int i=1 ; i<=3 ; i++) //for안에 문장은 한문장으로 침 => 괄호 안해도 ok
            for(int j=1 ; j<=3 ; j++)
                for(int k=1 ; k<=3 ; k++)
                    System.out.println(""+i+j+k);
    }
}
