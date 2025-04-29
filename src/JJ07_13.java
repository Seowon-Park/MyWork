public class JJ07_13 {
    public static void main(String[] args) {
        Time t = new Time(12,35,30);
        System.out.println(t);
        //t.hour = 13;
        t.setHour(t.getMinute()+1);
        System.out.println(t);
    }
}
class Time{
    private int hour, minute, second;

    Time(int hour, int minute, int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }
    public int getHour(){return hour;}
    public void setHour(int hour){
        if(hour<0||hour>23) return;
        this.hour = hour;
    }
    public int getMinute(){return minute;}
    public void setMinute(int m){
        if(m<0||m>59) return;
        minute = m;
    }
    public int getSecond(){return second;}
    public void setSecond(int s){
        if(s<0||s>59) return;
        second = s;
    }
    public String toString(){
        return hour + ":"+minute+":"+second;
    }
}