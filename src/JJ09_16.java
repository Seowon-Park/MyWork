import javax.annotation.processing.SupportedSourceVersion;

public class JJ09_16 {
    public static void main(String[] args) {
        int iVal = 100;
        String strVal = String.valueOf(iVal); //100

        double dVal = 200.0;
        String strVal2 = dVal+""; //200.0

        double sum = Integer.parseInt("-"+strVal)+Double.parseDouble(strVal2);//+100 과 200.0를 더한다
        double sum2 = Integer.valueOf(strVal)+Double.valueOf(strVal2);// 100과 200.0를 더한다

        System.out.println(String.join("",strVal,"+",strVal2,"=")+sum);
        System.out.println(strVal+"+"+strVal2+"="+sum2);
    }

}
