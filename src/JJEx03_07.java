public class JJEx03_07 {
    /*화씨는 썹씨로 변환 단, Math.round()없이 */
    public static void main(String[] args) {
        int fahrenheit =99;
        float celcius
                =((5.0/9.0*(fahrenheit-32)*1000)%10)>=5? (int)(5.0/9.0*(fahrenheit-32)*100+1)/100f :(int)(5.0/9.0*(fahrenheit-32)*100)/100f;
        System.out.println("Fahrenheit:"+fahrenheit);
        System.out.println("Celcius:"+celcius);
    }
}
