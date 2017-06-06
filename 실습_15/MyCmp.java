package 실습_15;

import java.util.Comparator;

/**
 * Created by byungjuchae on 2016. 12. 14..
 */

public class MyCmp implements Comparator<Integer> {
    @Override
    public int compare(Integer x, Integer y) {
        return x - y;
    }
}