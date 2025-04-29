public class JJ05_15 {
    public static void main(String[] args) {
        String hex = "CAFE";

        String[] binary = {"0000", "0001", "0010", "0011"
                , "0100", "0101", "0110", "0111"
                , "1000", "1001", "1010", "1011"
                , "1100", "1101", "1110", "1111"};

        String result = "";

        for(int i=0; i<hex.length(); i++){
            result += binary[hex.charAt(i)-'A'];
        }

        System.out.println("hex:"+hex);
        System.out.println("binary"+result);
    }
}
