package 실습_6; /**
 * Created by byungjuchae on 2016. 10. 5..
 */
import java.util.Scanner;

public class 실습_6_5 {
    public static void main(String[] args) {
        double a,b,c;
        Scanner input = new Scanner(System.in);
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        if(a>b && a>c){
            if(b>c){
                System.out.println(c+" "+b+" "+a);
            }
            else{
                System.out.println(b+" "+c+" "+a);
            }
        }
        else if(b>c){
            if(a>c){
                System.out.println(c+" "+a+" "+b);
            }
            else{
                System.out.println(a+" "+c+" "+b);
            }
        }
        else{
            if(a>b){
                System.out.println(b+" "+a+" "+c);
            }
            else{
                System.out.println(a+" "+b+" "+c);
            }
        }
    }
}
