//import java.security.PublicKey;
//
//public class JJEX07_19 {
//    public static void main(String[] args) {
//        Buyer b= new Buyer();
//        b.buy(new Tv());
//        b.buy(new Computer());
//        b.buy(new Tv());
//        b.buy(new Audio());
//        b.buy(new Computer());
//        b.buy(new Computer());
//        b.buy(new Computer());
//
//        b.summary();
//    }
//}
//
//class Buyer{
//    int money=1000;
//    Product[] cart = new Product[3];
//    int i = 0;
//    void buy(Product p){
//    /*1. 가진 돈과 물건의 가격을 비교해서 가진 돈이 적으면 메서드를 종료
//      2. 가진 돈이 충분하면, 제품의 가격을 가진 돈에서 빼고
//      3. 장바구니에 구입한 물건을 담는다.(add메서드 호출)*/
//        if(money<p.price){System.out.println("잔액이 부족하여"+p+"을/를 살 수 없습니다.");}
//        else{
//            money -= p.price;
//            add(p);
//        }
//    }
//    void add(Product p){
//    /*1. i의 값이 장바구니의 크기보다 같거나 크면
//         1. 기존의 장바구니보다 2배 큰 새로운 배열을 생성한다.
//         2. 기존의 장바구니의 내용을 새로운 배열에 복사
//         3. 새로운 장바구니와 기존의 장바구니를 바꾼다.
//      2. 물건을 장바구니(cart)에 저장한다. 그리고 i의 값을 1 증가시키다.
//    */
//        if(i>=cart.length){
//            Product[] cart2 = new Product[cart.length*2];
//            for(int j=0;j<cart.length;j++){
//                cart2[j]=cart[j];
//            }
//            cart=cart2;
//        }
//        cart[i]=p;
//        i++;
//    }
//    void summary(){
//    /*1. 장바구니에 담긴 물건들의 목록을 만들어 출력한다.
//      2. 장바구니에 담긴 가격을 모두 더해서 출력한다.
//      3. 물건을 사고 남은 금액(money)를 출력한다.
//    */
//        System.out.print("구입한 물건:");
//        for(Product name:cart){
//            System.out.print(name+",");
//        }
//        System.out.println();
//        System.out.println("사용한 금액:"+(1000-money));
//        System.out.println("남은 금액:"+money);
//
//    }
//}
//
//
//class Product{
//    int price;
//
//    Product(int price){
//        this.price=price;
//    }
//}
//class Tv extends Product{
//    Tv(){super(100);}
//    public String toString() {return "Tv";}
//}
//class Computer extends Product{
//    Computer(){super(200);}
//    public String toString() {return "Computer";}
//}
//class Audio extends Product{
//    Audio(){super(50);}
//    public String toString() {return "Audio";}
//}