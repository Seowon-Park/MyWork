public class JJ06_13 {//객체 생성 안하고 싶어서 static붙임 -> 에러! => 바깥 클래스에는 static 붙일 수 없음
    public static void main(String[] args) {
        JJ06_13 r = new JJ06_13();

        int result = r.add(3,5); //인스턴스 메서드이니까 객체 생성하고 접근
        System.out.println(result);

        int[] result2 ={0, };
        r.add(3,5,result2);
        System.out.println(result2[0]);
    }
    int add(int a, int b){
        return a+b;
    }
    void add(int a, int b, int[] result){
        result[0]=a+b;
    }
}