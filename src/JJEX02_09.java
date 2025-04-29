public class JJEX02_09 {
    public static void main(String[] args) {
        short sMin = -32768;
        short sMax = 32767;
        char cMin = 0;
        char cMax = 65535;

        System.out.println("sMin = "+sMin);
        System.out.println("SMin-1="+(short)(sMin-1));
        System.out.println("SMax="+sMax);
        System.out.println("SMax+1="+(short)(sMax+1));
        System.out.println("cMin="+(int)cMin);
        System.out.println("cMin="+(int)--cMin);
        System.out.println("cMax="+(int)cMax);
        System.out.println("cMax="+(int)++cMax);
    }
}
