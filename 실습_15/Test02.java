package 실습_15;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by byungjuchae on 2016. 12. 14..
 */
public class Test02 {
    public static void main(String [] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(new Integer(1));
        a.add(new Integer(2));
        a.add(new Integer(3));
        Iterator<Integer> i = a.iterator();
        while(i.hasNext()) {
            Object obj = i.next();
            System.out.println(obj.getClass());
            System.out.println(obj);
        }
    }
}
