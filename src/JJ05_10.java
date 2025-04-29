public class JJ05_10 {
    /*정렬하기(sort): 버블정렬*/
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for(int i=0;i<numArr.length;i++){
            System.out.print(numArr[i]=(int)(Math.random()*10));
        }
        System.out.println();

        for(int i=0; i<numArr.length-1; i++){
            boolean changed = false;

            for(int j=0; j<numArr.length-1-i;j++){
                if(numArr[j]>numArr[j+1]) {
                    int temp = numArr[j];
                    numArr[j] = numArr[j + 1];
                    numArr[j+1] = temp;
                    changed = true;
                }
            }
            if(!changed) break;

            for(int num: numArr){
                System.out.print(num);
            }
            System.out.println();
        }
    }

}
