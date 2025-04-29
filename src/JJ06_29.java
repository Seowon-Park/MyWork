class Document {
    static int count = 0;
    String name;

    {/*초기화블록*/
        System.out.print(count++ +"번 문서_");
    }

    Document(){/*생성자*/
        this("제목없음" + count); //생성자의 this() 파라미터 평가가 초기화블록보다 먼저 실행. count 맨처음 0으로 고정 -> 초기화블록(count+1) -> 생성자(0으로 고정된 count 출력)
    }

    Document(String name) {
        this.name = name; // 제목없음0
        System.out.println("문서 " + this.name + "가 생성되었습니다.");
    }
}
public class JJ06_29 {
    public static void main(String[] args) {
        Document d1 = new Document();
        Document d2 = new Document("자바.txt");
        Document d3 = new Document();
        Document d4 = new Document();
    }
}
