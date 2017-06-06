package 실습_8;

import java.util.Scanner;

/**
 * Created by byungjuchae on 2016. 10. 19..
 */
public class Lab08_2 {
    public static boolean isSorted(int[] list) {
        Scanner input = new Scanner(System.in);
        for (int i=0; i<list.length; i++){
            list[i]=input.nextInt();
        }
        for(int i=0; i<list.length-1; i++){
            if(list[i]>list[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        int list_size;
        boolean result;
        Scanner input = new Scanner(System.in);
        list_size = input.nextInt();
        int[] list = new int[list_size];
        result=isSorted(list);
        if(result==true){
            System.out.println("The list is already sorted");
        }
        else{
            System.out.println("The list is not sorted");
        }
    }
}
