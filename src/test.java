//public class test {
//    public static void main(String[] args) {
//        Point[] p ={
//                new Point(100,100),
//                new Point(140,50),
//                new Point(200,100)
//        };
//        Triangle t = new Triangle(p);
//        Circle c = new Circle(new Point(150,150),50);
//
//        t.toDraw();
//        c.toDraw();
//    }
//}
//class Shape{
//    String color;
//    Shape(){this("black");}
//    Shape(String color){this.color=color;}
//    void draw(){
//        System.out.printf("[color]=%s%n",color);
//    }
//}
//class Point{
//    int x;
//    int y;
//    Point(){this(0,0);}
//    Point(int x, int y){this.x=x; this.y=y;}
//    String getXY(){return "("+x+","+y+")";}
//}
//class Triangle extends Shape{
//    Point[] p= new Point[3];
//    Triangle(Point[] p){this.p=p;}
//    void toDraw(){
//        System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n",p[0].getXY(),p[1].getXY(),p[2].getXY(),color);
//    }
//}
//class Circle extends Shape{
//    Point p;
//    int r;
//    Circle(){this(new Point(),0);}
//    Circle(Point p, int r){this.p=p; this.r=r;}
//    void toDraw(){
//        System.out.printf("[center=(%d,%d), r=%d, color=%s]%n",p.x,p.y,r,color);
//    }
//}
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int stucount = 0;
        String stuname = "";
        String stuscore2 = "";
        int stuscore = 0;
        int stuscoresum = 0;
        float stuscoreave = 0f;
        Scanner s = new Scanner(System.in);
        System.out.print("학생 수를 입력하세요: ");
        stucount = s.nextInt();
        String[] str = new String[stucount];
        String[] stuallname = new String[stucount];
        int[] stuallscore = new int[stucount];
        System.out.print("학생 이름과 점수를 입력하세요: ");
        for (int i = 0; i < str.length; i++){
            str[i] = s.next();
            int j = 0;
            while(!('0' < str[i].charAt(j) && str[i].charAt(j) < '9')){
                char ch = str[i].charAt(j);
                stuname += ch;
                j++;
            }
            stuallname[i] = stuname;
            stuname = "";
            for (int t = stuallname[i].length(); t < str[i].length(); t++){
                stuscore2 += str[i].charAt(t);
            }
            stuscore = Integer.parseInt(stuscore2);
            stuscore2 = "";
            stuallscore[i] = stuscore;
            stuscoresum += stuallscore[i];
        }
        stuscoreave = (float)(stuscoresum / stucount);
        System.out.printf("평균: %.1f\n", stuscoreave);
        for (int t = 0; t < stucount; t++){
            if (stuscoreave > stuallscore[t]){
                System.out.printf("%s fail!\n",stuallname[t]);
            } else{
                System.out.printf("%s pass!\n",stuallname[t]);
            }
        }
    }
}
