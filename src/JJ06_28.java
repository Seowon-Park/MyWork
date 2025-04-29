public class JJ06_28 {
    static int count = 0;
    int serialNo;
    {
        ++count;
        serialNo=count;
    }
    public JJ06_28(){}
}
class ProductTest{
    public static void main(String[] args) {
        JJ06_28 p1 = new JJ06_28();
        JJ06_28 p2 = new JJ06_28();
        JJ06_28 p3 = new JJ06_28();

        System.out.println("p1의 제품번호(serial no)는 "+p1.serialNo);
        System.out.println("p2의 제품번호(serial no)는 "+p2.serialNo);
        System.out.println("p3의 제품번호(serial no)는 "+p3.serialNo);
        System.out.println("생산된 제품의 수는 모두"+JJ06_28.count+"개 입니다.");
    }
}