//public class JJ07_24 {
//    public static void main(String[] args) {
//        Fightable f =new Fighter();
//
//        if(f instanceof Unit){System.out.println("f가 가리키는 인스턴스는 Unit클래스의 자신or자손입니다.");}
//        if(f instanceof Fightable){System.out.println("f가 가리키는 인스턴스는 Fight인터페이스를 구현했습니다.");}
//        if(f instanceof Movable){System.out.println("f가 가리키는 인스턴스는 Movable인터페이스를 구현했습니다.");}
//        if(f instanceof Attackable){System.out.println("f가 가리키는 인스턴스는 Attackable인터페이스를 구현했습니다.");}
//        if(f instanceof Object){System.out.println("f가 가리키는 인스턴스는 Object클래스의 자신or자손입니다.");}
//    }
//}
//interface Attackable{void attack(Unit u);}
//interface Movable{void move(int x, int y);}
//interface Fightable extends Movable, Attackable{ }
//class Unit{
//    int currentHP;
//    int x;
//    int y;
//}
//class Fighter extends Unit implements Fightable{
//    public void attack(Unit u){}
//    public void move(int x, int y){}
//}