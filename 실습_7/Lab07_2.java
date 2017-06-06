package 실습_7;

/**
 * Created by byungjuchae on 2016. 10. 12..
 */
public class Lab07_2 {
    public static void main(String [] args) {
        double x=0, y=0;
        for(int i=1; i<=50000; i++){
            x+=(double)1/i;
        }
        for (int j=50000; j>0; j--){
            y+=(double)1/j;
        }
        System.out.printf("%.15f\n%.15f", x, y);
    }
}
