package 실습_15;

import java.util.ArrayList;

/**
 * Created by byungjuchae on 2016. 12. 14..
 */
public class Test05 {
    public static void main(String [] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(new Integer(1));
        a1.add(new Integer(2));
        a1.add(new Integer(3));
        ArrayList<Integer> a2 = new ArrayList<>(a1);
        a2.add(new Integer(4));
        System.out.println(a1);
        System.out.println(a2);
    }
}
