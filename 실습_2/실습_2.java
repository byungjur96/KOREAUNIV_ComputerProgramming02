package 실습_2; /**
 * Created by byungjuchae on 2016. 9. 28..
 */
import java.util.Scanner;

public class 실습_2 {
    public static void main(String [] args) {
        int x;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter(int): ");
        x = input.nextInt();
        System.out.println(x+"+1 = "+(x+1));
    }
}
