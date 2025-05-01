//import java.util.Arrays;
//
//public class HW07_01 {
//    public static void main(String[] args) {
//        Card[] cardArr = {
//                new Card(1,"H"),new Card(2,"D"),new Card(3,"H"),
//                new Card(4,"H"),new Card(5,"H")};
//
//        int flush=0;
//        int fourCard=0;
//        int treeCard=0;
//        int twoCard=0;
//        int straightCheck=1;
//
//        int[] kind= new int[4];
//        int[] num= new int[13];
//
//        for(int i =0;i<5;i++){
//            if(cardArr[i].kind.equals("H")){kind[0]++;}
//            if(cardArr[i].kind.equals("D")){kind[1]++;}
//            if(cardArr[i].kind.equals("C")){kind[2]++;}
//            if(cardArr[i].kind.equals("S")){kind[3]++;}
//            num[cardArr[i].num-1]++;
//        }
//
//        for(int i=0;i<13;i++) {
//            if(num[i]==4){fourCard++;}
//            if(num[i]==3){treeCard++;}
//            if(num[i]==2){twoCard++;}
//            if(num[i]==1&&num[i+1]==1){straightCheck++;}
//        }
//        for(int check: kind){
//            if(check==5){flush++; break;}
//        }
//
//        if(straightCheck==5&&flush==1){System.out.println("STRAIGHT FlUSH");}
//        else if(fourCard==1){System.out.println("FOUR CARD");}
//        else if(treeCard==1&&twoCard==1){System.out.println("FULL HOUSE");}
//        else if(flush==1){System.out.println("FLUSH");}
//        else if(straightCheck==5){System.out.println("STRAIGHT");}
//        else if(treeCard==1){System.out.println("THREE CARD");}
//        else if(twoCard==2){System.out.println("2PAIR");}
//        else if(twoCard==1){System.out.println("1PAIR");}
//        else{System.out.println("NO RANK");}
//
//        System.out.println(Arrays.toString(kind)+","+Arrays.toString(num));
//        System.out.println("S:"+straightCheck+"/4:"+fourCard+"/3:"+treeCard+"/2:"+twoCard+"/F:"+flush);
//    }
//}
//class Card {
//    int num;
//    String kind;
//
//    Card(int num, String kind) {
//        this.num = num;
//        this.kind = kind;
//    }
//
//    public String toString() {
//        return "Card [num=" + num + ", kind=" + kind + "]";
//    }
//}