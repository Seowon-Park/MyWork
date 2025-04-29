//public class JJ07_15 {
//    public static void main(String[] args) {
//        Car car = null;
//        FireEngine fe = new FireEngine();
//        FireEngine fe2 = null;
//        Car car2 = new Car();
//
//        car2.drive();
//        fe.drive();
//        car2=fe;
//        car2.drive();
//
//        fe.water();
//        car = fe;
//        //car.water();
//        fe2 = (FireEngine)car;
//        fe2.water();
//    }
//}
//class Car{
//    String color;
//    int door;
//
//    static void drive(){
//        System.out.println("drive, Brrrr~");
//    }
//    void stop(){
//        System.out.println("stop!!");
//    }
//}
//class FireEngine extends Car{
//    static void drive(){ System.out.println("drive, 부릉");}
//    void water(){
//        System.out.println("water!!");
//    }
//}