import java.util.*; // vector클래스 사용을 위해 추가

public class JJ07_22 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        Tv tv = new Tv();
        Com com = new Com();
        Audio audio = new Audio();

        b.buy(tv);
        b.buy(tv);
        b.buy(com);
        b.buy(audio);

        b.summary();

        System.out.println();

        b.refund(tv);
        b.summary();
    }
}
class Product{
    int price;
    int bonusP;
    Product(int p){
        price = p;
        bonusP = p/10;
    }
    Product(){this(0);}
}
class Tv extends Product{
    Tv(){super(100);}
    public String toString() {return "Tv";}
}
class Com extends Product{
    Com(){super(200);}
    public String toString() {return "Com";}
}
class Audio extends Product{
    Audio(){super(50);}
    public String toString() {return "Audio";}
}
class Buyer{
    int money = 1000;
    int bonusPoint = 0;
    Vector item = new Vector();

    void buy(Product p){
        if(money<p.price){
            System.out.println("잔액이 부족합니다.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusP;
        item.add(p);
        System.out.println(p+"를 구입하셨습니다.");
    }

    void refund(Product p){
        if(item.remove(p)){
            money += p.price;
            bonusPoint -= p.bonusP;
            System.out.println(p+"를 반품하셨습니다.");
        }else{
            System.out.println("구입한 항목 중 해당 제품이 없습니다.");
        }
    }

    void summary(){
        int sum = 0;
        String itemList = "";

        if(item.isEmpty()){
            System.out.println("구입하신 제품이 없습니다.");
            return;
        }
        for(int i=0; i<item.size(); i++){
            Product p = (Product) item.get(i);
            sum += p.price;
            itemList += (i==0)?""+p:", "+p;
        }
        System.out.println("구입 한 제품의 총 금액은 "+sum+"만원입니다.");
        System.out.println("구입하신 제품은 "+itemList+"점입니다.");
    }
}