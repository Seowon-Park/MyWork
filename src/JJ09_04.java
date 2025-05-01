//public class JJ09_04 {
//    public static void main(String[] args){
//        Card c1 = new Card();
//        Card c2 = new Card();
//
//        System.out.println(c1);
//        System.out.println(c2);
//        System.out.println(c1.equals(c2));
//        System.out.println(c1.hashCode());
//        System.out.println(c2.hashCode());
//    }
//}
//
//class Card{
//    String kind;
//    int number;
//
//    Card(){
//        this("SPADE",1);
//    }
//    Card(String kind, int number){
//        this.kind=kind;
//        this.number=number;
//    }
//    public String toString(){
//        return "카드객체 리턴"+kind+"/"+number;
//    }
//    public boolean equals(Object o){
//        if(o instanceof Card){
//            return number==((Card)o).number;
//        }
//        else return false;
//    }
//    public int hashCode(){
//        System.out.println("같은 인스턴스는 아니지만 같은 객체야");
//        return 0;
//    }
//}
