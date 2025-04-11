public class HW06_01 {
    /*세 개의 정수를 받아서 중간 크기의 값을 반환 하는 mid메서드 작성*/
    public static void main(String[] args) {
        System.out.println(mid(1,2,3));
        System.out.println(mid(2,1,3));
        System.out.println(mid(1,2,2));
        System.out.println(mid(1,1,3));
    }
    static int mid(int... mid){
        int swp;
        for(int i=0;i<3;i++){
            if(mid[i]<mid[0]){swp=mid[0]; mid[0]=mid[i]; mid[i]=swp;}
        }
        if(mid[1]>mid[2]){swp=mid[1]; mid[1]=mid[2]; mid[2]=swp;}
        return mid[1];
    }
}

