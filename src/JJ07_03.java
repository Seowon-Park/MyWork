//public class JJ07_03 {
//    public static void main(String[] args) {
//        Deck d =new Deck();
//        Card c = d.pick();
//        System.out.println(c);
//
//        d.shuffle();
//        // c=d.pick();
//        System.out.println(c);
//    }
//
//}
//class Card{
//    static final int KIND_MAX = 4;
//    static final int NUM_MAX = 13;
//
//    static final int SPADE = 4;
//    static final int DIAMOND = 3;
//    static final int HEART = 2;
//    static final int CLOVER = 1;
//
//    int kind;
//    int number;
//
//    Card(){this(SPADE,1);}
//    Card(int kind, int number){this.kind=kind; this.number=number;}
//    Card(Card c){
//        this.kind = c.kind;
//        this.number = c.number;
//    }
//    public String toString(){
//        String[] kinds = {"","CLOVER","HEART","DIAMOND","SPADE"};
//        String number = "0123456789XJQK";
//
//        return "kind: " + kinds[this.kind] + ", number" + number.charAt(this.number);
//    }
//}
//class Deck{
//    final int CARD_NUM = 52;
//    Card[] cardArr = new Card[CARD_NUM];
//
//    Deck(){
//        int i=0;
//
//        for(int k=Card.KIND_MAX ; k>0 ; k--)
//            for(int n=0 ; n<Card.NUM_MAX ; n++)
//                cardArr[i++] = new Card(k,n+1);
//    }
//    Card pick(int index){
//        return cardArr[index];
//    }
//    Card pick(){
//        int index = (int)(Math.random()*CARD_NUM);
//        return pick(index);
//    }
//    void shuffle(){
//
//        for(int i=0 ; i<cardArr.length ; i++){
//            int r = (int)(Math.random()*CARD_NUM);
//            Card temp = new Card(cardArr[r]);
//            cardArr[r].number = cardArr[i].number;
//            cardArr[r].kind = cardArr[i].number;
//            cardArr[i].number = temp.number;
//            cardArr[i].kind = temp.kind;
//        }
//    }
//}