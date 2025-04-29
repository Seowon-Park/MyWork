class Data{int x;}

public class JJ06_14 {
    public static void main(String[] args) {
        JJ06_14 jj = new JJ06_14();
        Data d = new Data();
        d.x = 10;

        Data d2 = jj.copy(d);
        System.out.println(d.x);
        System.out.println(d2.x);
    }
    Data copy(Data d){
        Data tmp = new Data();
        tmp.x = d.x;

        return tmp;
    }
}

