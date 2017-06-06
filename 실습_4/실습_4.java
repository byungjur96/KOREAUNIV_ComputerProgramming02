package 실습_4; /**
 * Created by byungjuchae on 2016. 9. 28..
 */
import java.util.Scanner;

public class 실습_4 {
    public static void main(String [] args) {
        double x=0;
        double sin=0;
        Scanner input = new Scanner(System.in);
        while(true){
            x = input.nextFloat();
            if(x == -1){
                break;
            }
            sin=Math.sin(x);
            System.out.println(sin);
            x=0;
        }
        System.out.println("Finish!");
    }
}
