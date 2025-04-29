//public class JJ07_21 {
//    public static void main(String[] args) {
//        Buyer b = new Buyer();
//
//        b.buy(new Tv());
//        b.buy(new Com());
//
//        System.out.println("현재 남은 돈은 "+b.money+"만원입니다.");
//        System.out.println("현재 보너스 점수는 "+b.bonusPoint+"점입니다.");
//    }
//}
//class Product{
//    int price;
//    int bonusP;
//    Product(int p){
//        price = p;
//        bonusP = p/10;
//    }
//}
//class Tv extends Product{
//    Tv(){
//        super(100);
//    }
//    public String toString() {return "Tv";}
//}
//class Com extends Product{
//    Com(){
//        super(200);
//    }
//    public String toString() {return "Com";}
//}
//class Buyer{
//    int money = 1000;
//    int bonusPoint = 0;
//
//    void buy(Product p){
//        if(money<p.price){
//            System.out.println("잔액이 부족합니다.");
//            return;
//        }
//        money -= p.price;
//        bonusPoint += p.bonusP;
//        System.out.println(p+"를 구입하셨습니다.");
//    }
//}