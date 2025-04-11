//import static java.lang.System.out;
//
//abstract class Shape{
//    Point p;
//
//    Shape(){this(new Point(0,0));}
//
//    Shape(Point p){
//        this.p=p;
//    }
//    abstract double calcArea();
//
//    Point getPosition(){
//        return p;
//    }
//    void setPosition (Point p){
//        this.p=p;
//    }
//}
//
//class Point{
//    int x;
//    int y;
//
//    Point(){this(0,0);}
//    Point(int x, int y){this.x=x; this.y=y;}
//    public String toString(){return "["+x+","+y+"]";}
//
//}
//
//class Circle extends Shape{
//    double r;
//
//    Circle(){
//        this(0);
//    }
//
//    Circle(double r){
//        this.r=r;
//    }
//
//    double calcArea(){
//        return r*r*3.14;
//    }
//
//}
//
//class Rectangle extends Shape{
//    double width;
//    double height;
//
//    Rectangle(){this(0,0);}
//
//    Rectangle(double width, double height){
//        this.width=width;
//        this.height=height;
//    }
//
//    boolean isSquare(){
//        return width==height;
//    }
//
//    double calcArea(){
//        return width*height;
//    }
//}
//
//public class JJEx07_22 {
//    public static void main(String[] args) {
//        Rectangle r = new Rectangle(2,3);
//        out.println(r.isSquare());
//
//    }
//}
