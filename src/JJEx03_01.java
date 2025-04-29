public class JJEx03_01 {
    /* 필요한 사과 상자는 몇개? - 올림계산 */
    public static void main(String[] args) {
        int numOfApples =123;
        int sizeOfBucket = 10;
        int numOfBucket =(int)(Math.ceil(numOfApples/10.0)*10)/sizeOfBucket;
        System.out.println("필요한 바구니의 수:"+numOfBucket);
    }
}
