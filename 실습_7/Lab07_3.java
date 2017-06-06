package 실습_7;

/**
 * Created by byungjuchae on 2016. 10. 12..
 */
public class Lab07_3 {

    public static void main(String [] args) {
        double result_200=1, result_100000=1;
        double sum_200=1, sum_100000=1;

        for(int i=1; i<=200; i++){
            sum_200*=(double)1/i;
            result_200+=sum_200;
        }
        for(int i=1; i<=100000; i++){
            sum_100000*=(double)1/i;
            result_100000+=sum_100000;
        }
        System.out.println("200: " + result_200);
        System.out.println("100000: " + result_100000);
    }
}
