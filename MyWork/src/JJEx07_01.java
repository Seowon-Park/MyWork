//import static java.lang.System.out;
//
//class SutdaDeck{
//    final int CARD_NUM=20;
//    SutdaCard[] cards=new SutdaCard[CARD_NUM];
//
//    SutdaDeck(){
//      for(int i=0;i<CARD_NUM;i++){
//          if(i/10==0){
//              if(i+1==1 || i+1==3 || i+1==8){cards[i]=new SutdaCard(i+1,true);}
//              else  cards[i]=new SutdaCard(i+1,false);
//          }
//          else cards[i]=new SutdaCard(i-9,false);
//      }
//    }
//}
//class SutdaCard{
//    int num;
//    boolean isKwang;
//
//    SutdaCard(){
//        this(1,true);
//    }
//    SutdaCard(int num, boolean isKwang){
//        this.num=num;
//        this.isKwang = isKwang;
//    }
//    public String toString(){
//        return num+(isKwang?"K":"");
//    }
//}
//public class Ex07_01 {
//    public static void main(String[] args) {
//        SutdaDeck deck = new SutdaDeck();
//        for(int i=0;i<deck.cards.length;i++){
//            out.print(deck.cards[i]+",");
//        }
//    }
//}
