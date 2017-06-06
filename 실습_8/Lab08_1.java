package 실습_8;

import java.util.Scanner;

/**
 * Created by byungjuchae on 2016. 10. 19..
 */
public class Lab08_1 {
    public static void main(String [] args){
        int num;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        for(int i=0; i<num; i++){
            for(int j=num-i+1;j>0; j--){
                System.out.print("  ");
            }
            for(int j=i+1; j>0; j--){
                System.out.print(j+" ");
            }
            for(int j=2; j<=i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
