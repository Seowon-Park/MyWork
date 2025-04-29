public class JJ06_27 {
    static{
        System.out.println("static{ }");
    }
    {
        System.out.println("{}");
    }
    public void blockTest(){
        System.out.println("생성자");
    }
    public static void main(String[] args) {
        System.out.println("BlockTest bt = new BlockTest();");
        JJ06_27 bt = new JJ06_27();

        System.out.println("BlockTest bt2 = new BlockTest();");
        JJ06_27 bt2 = new JJ06_27();
    }
}
